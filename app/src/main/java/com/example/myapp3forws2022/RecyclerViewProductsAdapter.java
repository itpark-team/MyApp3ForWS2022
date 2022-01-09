package com.example.myapp3forws2022;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewProductsAdapter extends RecyclerView.Adapter<RecyclerViewProductsAdapter.ProductViewHolder> {

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewProductName;
        public TextView textViewProductPrice;

        ProductViewHolder(View view) {
            super(view);

            textViewProductName = view.findViewById(R.id.textViewProductName);
            textViewProductPrice = view.findViewById(R.id.textViewProductPrice);
        }
    }

    private ArrayList<Product> products;

    public RecyclerViewProductsAdapter(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    @Override
    public RecyclerViewProductsAdapter.ProductViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_item, viewGroup, false);

        RecyclerViewProductsAdapter.ProductViewHolder holder = new RecyclerViewProductsAdapter.ProductViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewProductsAdapter.ProductViewHolder holder, int i) {
        Product product = products.get(i);

        holder.textViewProductName.setText(product.name);
        holder.textViewProductPrice.setText(Integer.toString(product.price));
    }

}
