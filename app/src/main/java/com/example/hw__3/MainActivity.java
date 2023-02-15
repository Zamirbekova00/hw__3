package com.example.hw__3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> brandList;
    private BrandAdapter adapter;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_brands);
        loadData();
        adapter = new BrandAdapter(brandList);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        brandList = new ArrayList<>();
        brandList.add("Zara");
        brandList.add("Mango");
        brandList.add("Gucci");
        brandList.add("Prada");
        brandList.add("Nike");
        brandList.add("Louis Vuitton");
        brandList.add("Hermes");
        brandList.add("Adidas");
        brandList.add("H&M");
        brandList.add("Cartier");
        brandList.add("Chanel");
        brandList.add("Rolex");
        brandList.add("Swarovski");
        brandList.add("Burberry");
        brandList.add("Tom Ford");
        brandList.add("The North Face");

    }
}