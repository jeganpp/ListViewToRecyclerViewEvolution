package com.example.listviewwithcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.listviewwithcustomadapter.data.Month;

public class CustomAdaptor extends BaseAdapter {
    Month[] months;
    Context context;
    public CustomAdaptor(Context context, Month[] months) {
        this.context = context;
        this.months = months;
    }

    @Override
    public int getCount() {
        return months.length;
    }

    @Override
    public Object getItem(int position) {
        return months[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.custom_view_2,parent, false);
        TextView tv_id = (TextView)convertView.findViewById(R.id.tv_id);
        TextView tv_name = (TextView)convertView.findViewById(R.id.tv_name);
        TextView tv_desc = (TextView)convertView.findViewById(R.id.tv_description);
        tv_id.setText(String.valueOf(months[position].getId()));
        tv_name.setText(months[position].getName());
        tv_desc.setText(months[position].getDescription());
        return convertView;
    }
}
