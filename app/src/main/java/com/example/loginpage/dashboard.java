package com.example.loginpage;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;

import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.loginpage.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


import java.util.ArrayList;

public class dashboard extends AppCompatActivity {
    private ImageView image;
    Button logo_1;
    ImageView imageView;
    ActivityMainBinding binding;
    RecyclerView recyclerView;
    ArrayList<SetterGetter> datamenu;
    GridLayoutManager gridLayoutManager;
    BottomNavigationView bottomNavigationView;
    DashBoardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setContentView(R.layout.test);
        image = findViewById(R.id.logo_1);



       /* imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(dashboard.this, produk.class));
            }
        });*/
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        Intent intent = new Intent(dashboard.this, dashboard.class);
                        startActivity(intent);
                        return true;
                    case R.id.promo:
                        Intent intent2 = new Intent(dashboard.this, promoFragment.class);
                        startActivity(intent2);
                        return true;
                    case R.id.Profile:
                        Intent intent3 = new Intent(dashboard.this, ProfileFragment.class);
                        startActivity(intent3);
                        return true;

                }
                return false;
            }
        });


        recyclerView = findViewById(R.id.rv_menu);
        addData();
        gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager((gridLayoutManager));
        adapter = new DashBoardAdapter(datamenu);
        recyclerView.setAdapter(adapter);


    }

    public void addData() {

        datamenu = new ArrayList<>();
        datamenu.add(new SetterGetter("Hand sanitizer", "img_1"));
        datamenu.add(new SetterGetter("P3k", "img_2"));
        datamenu.add(new SetterGetter("Alat Kesehatan", "img_3"));
        datamenu.add(new SetterGetter("kontrasepsi", "img_4"));
        datamenu.add(new SetterGetter("Vitamin", "img_5"));
        datamenu.add(new SetterGetter("Obat Herbal", "img_6"));
        datamenu.add(new SetterGetter("Suplemen", "img_7"));
        datamenu.add(new SetterGetter("Kecantikan", "img_8"));
        datamenu.add(new SetterGetter("Susu", "img_9"));
    }

    /*public void pindah(){
        Intent pindahlaman = new Intent(getApplicationContext(),produk.class);
        startActivity(pindahlaman);
    }*/

    public void pindah1(View view) {
        Intent intent = new Intent(dashboard.this, produk.class);
        startActivity(intent);
    }
    public void berita(View view){
        Intent intent = new Intent(dashboard.this, berita.class);
        startActivity(intent);
    }
    public void throww(View view){
        Intent intent = new Intent(dashboard.this, map.class);
        startActivity(intent);
    }
}