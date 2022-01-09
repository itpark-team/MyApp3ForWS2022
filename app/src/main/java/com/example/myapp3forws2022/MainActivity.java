package com.example.myapp3forws2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Product> products;
    private RecyclerView recyclerViewProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        products = new ArrayList<>();
        products.add(new Product("Вино", 750));
        products.add(new Product("Шокола", 150));
        products.add(new Product("Сыр", 300));

        recyclerViewProducts = findViewById(R.id.recyclerViewProducts);

        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        recyclerViewProducts.setLayoutManager(llm);

        RecyclerViewProductsAdapter adapter = new RecyclerViewProductsAdapter(products);
        recyclerViewProducts.setAdapter(adapter);
    }
}