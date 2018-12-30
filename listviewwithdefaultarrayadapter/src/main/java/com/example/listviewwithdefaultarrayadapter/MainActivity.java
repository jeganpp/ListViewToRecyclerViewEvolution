package com.example.listviewwithdefaultarrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.lv_1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_1, DataUtil.getNames());
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, DataUtil.getNames());
        listView.setAdapter(adapter);
    }
}
