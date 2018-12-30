package com.example.listviewcustomadapterimprovised;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.listviewcustomadapterimprovised.data.CustomAdaptor;
import com.example.listviewcustomadapterimprovised.data.DataUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.lv_1);
        CustomAdaptor adaptor = new CustomAdaptor(this, DataUtil.getMonths());
        listView.setAdapter(adaptor);
    }
}
