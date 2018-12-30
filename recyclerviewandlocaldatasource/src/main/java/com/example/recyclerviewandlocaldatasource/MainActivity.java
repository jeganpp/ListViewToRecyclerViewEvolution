package com.example.recyclerviewandlocaldatasource;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerviewandlocaldatasource.data.DataUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rv_1);
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(this, DataUtil.getMonths());
        recyclerView.setAdapter(adapter);
    }
}
