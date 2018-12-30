package com.example.listviewcustomadapterimprovised.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.listviewcustomadapterimprovised.R;

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
        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.custom_view_2, parent, false);
            convertView.setTag(new MyViewHolder(convertView));
        }
        MyViewHolder viewHolder = (MyViewHolder) convertView.getTag();
        viewHolder.tv_id.setText(String.valueOf(months[position].getId()));
        viewHolder.tv_name.setText(months[position].getName());
        viewHolder.tv_desc.setText(months[position].getDescription());
        return convertView;
    }

    private static class MyViewHolder {
        TextView tv_id = null;
        TextView tv_name = null;
        TextView tv_desc = null;

        public MyViewHolder(View v) {
            tv_id = (TextView)v.findViewById(R.id.tv_id);
            tv_name = (TextView)v.findViewById(R.id.tv_name);
            tv_desc = (TextView)v.findViewById(R.id.tv_description);
        }
    }
}
