package com.example.hw__3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BrandViewHolder extends RecyclerView.ViewHolder {
    private TextView tvBrand;

    public BrandViewHolder(@NonNull View itemView) {
        super(itemView);
        tvBrand = itemView.findViewById(R.id.tv_brands);
    }
    void bind(String brand){
        tvBrand.setText(brand);

    }
}
