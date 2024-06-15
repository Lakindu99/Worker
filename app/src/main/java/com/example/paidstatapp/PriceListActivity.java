package com.example.paidstatapp;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.paidstatapp.network.ApiService;
import com.example.paidstatapp.network.PriceAdapter;
import com.example.paidstatapp.network.PriceItem;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PriceListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PriceAdapter priceAdapter;
    private List<PriceItem> priceList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_list);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        priceAdapter = new PriceAdapter(priceList);
        recyclerView.setAdapter(priceAdapter);

        fetchPrices();
    }

    private void fetchPrices() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:3000/")  // Use 10.0.2.2 to connect to localhost from Android Emulator
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);

        apiService.getPriceList().enqueue(new Callback<List<PriceItem>>() {
            @Override
            public void onResponse(Call<List<PriceItem>> call, Response<List<PriceItem>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Log.d("PriceListActivity", "Data fetched: " + response.body().toString());
                    priceList.clear();
                    priceList.addAll(response.body());
                    priceAdapter.notifyDataSetChanged();
                } else {
                    Log.d("PriceListActivity", "Response not successful or body is null");
                }
            }

            @Override
            public void onFailure(Call<List<PriceItem>> call, Throwable t) {
                Log.d("PriceListActivity", "Failed to fetch data: " + t.getMessage());
            }
        });
    }
}