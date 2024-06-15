package com.example.paidstatapp.network;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paidstatapp.R;

import java.util.List;

public class PriceAdapter extends RecyclerView.Adapter<PriceAdapter.PriceViewHolder> {

    private List<PriceItem> priceList;

    public PriceAdapter(List<PriceItem> priceList) {
        this.priceList = priceList;
    }

    @Override
    public PriceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_price, parent, false);
        return new PriceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PriceViewHolder holder, int position) {
        PriceItem priceItem = priceList.get(position);
        holder.priceTextView.setText(priceItem.getPrice());
    }

    @Override
    public int getItemCount() {
        return priceList.size();
    }

    public static class PriceViewHolder extends RecyclerView.ViewHolder {
        TextView priceTextView;

        public PriceViewHolder(View itemView) {
            super(itemView);
            priceTextView = itemView.findViewById(R.id.priceTextView);
        }
    }
}
