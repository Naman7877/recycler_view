package com.example.recyclervies_tutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.recyclervies_tutorial.adaptars.Recipies_adapter;
import com.example.recyclervies_tutorial.module.recipies;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rec;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rec=findViewById(R.id.rec);
        getSupportActionBar().hide();
        

        ArrayList<recipies> list=new ArrayList<>();
        list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.one, "Noodles" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.one, "Noodles" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.one, "noodles" ));list.add(new recipies(R.drawable.one, "N" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));list.add(new recipies(R.drawable.cafe, "burger" ));

        Recipies_adapter adapter = new Recipies_adapter(list,this);
        rec.setAdapter(adapter);
        //for linear layout;
       // LinearLayoutManager layoutManager=new LinearLayoutManager(this);
       // rec.setLayoutManager(layoutManager);

        // for grid layout.

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rec.setLayoutManager(gridLayoutManager);

        // for stagared layout.

        // staggeredGridLayoutManager=new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL);
        //rec.setLayoutManager(staggeredGridLayoutManager);
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Greet")
                .setIcon(R.drawable.ic_baseline_check_24)
                .setMessage("welcome all ")
                .show();


        
    }
}