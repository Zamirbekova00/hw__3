package com.example.hw__3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BrandAdapter extends RecyclerView.Adapter<BrandViewHolder> {
    private ArrayList<String> brandList;

    public BrandAdapter(ArrayList<String> brandList) {
        this.brandList = brandList;
    }

    @NonNull
    @Override
    public BrandViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BrandViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_brand, parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull BrandViewHolder holder, int position) {
        holder.bind(brandList.get(position));

    }

    @Override
    public int getItemCount() {
        return brandList.size();
    }
}
