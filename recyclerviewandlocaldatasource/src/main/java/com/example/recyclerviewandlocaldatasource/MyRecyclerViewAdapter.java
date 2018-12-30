package com.example.recyclerviewandlocaldatasource;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerviewandlocaldatasource.data.Month;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {

    Context context;
    Month[] months;

    public MyRecyclerViewAdapter(Context context, Month[] months) {
        this.context = context;
        this.months = months;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.card_view_month, viewGroup, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
        viewHolder.tv_id.setText(String.valueOf(months[i].getId()));
        viewHolder.tv_name.setText(months[i].getName());
        viewHolder.tv_desc.setText(months[i].getDescription());
    }

    @Override
    public int getItemCount() {
        return months.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_id;
        TextView tv_name;
        TextView tv_desc;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_id = itemView.findViewById(R.id.tv_id);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_desc = itemView.findViewById(R.id.tv_description);
        }
    }
}
