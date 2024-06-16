package com.example.paidstatapp.network;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.paidstatapp.R;
import java.util.List;

public class PriceAdapter extends RecyclerView.Adapter<PriceAdapter.PriceViewHolder> {

    private Context context;
    private List<PriceItem> priceList;

    public PriceAdapter(Context context, List<PriceItem> priceList) {
        this.context = context;
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
        holder.nameTextView.setText(priceItem.getName());
        holder.priceTextView.setText("Rs. " + priceItem.getPrice());
        Glide.with(context)
                .load(priceItem.getImageUrl())
                .into(holder.itemImageView);
        System.out.println(priceItem.getWebsiteUrl());
        // Handle Buy Now button click
        holder.buyNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = priceItem.getWebsiteUrl();
                openWebsite(url);
            }
        });
    }

    @Override
    public int getItemCount() {
        return priceList.size();
    }

    private void openWebsite(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        context.startActivity(intent);
    }

    public static class PriceViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView priceTextView;
        ImageView itemImageView;
        Button buyNowButton;

        public PriceViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            priceTextView = itemView.findViewById(R.id.priceTextView);
            itemImageView = itemView.findViewById(R.id.itemImageView);
            buyNowButton = itemView.findViewById(R.id.btnBuyNow);
        }
    }
}
