package com.universalmastery.eggtastic;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by D.Brown on 3/26/16.
 */
public class BaseAdapter extends RecyclerView.Adapter<BaseAdapter.ViewHolder> {

    List<String> items;

    public BaseAdapter() {
        super();

        items.add("Hard Boiled");
        items.add("Soft boiled");
        items.add("Scrambled");
        items.add("Sunny Side up");
        items.add("Basted");
        items.add("Poached");
        items.add("Spanish Fried Egg");

    }

    @Override
    public BaseAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recipe_card, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BaseAdapter.ViewHolder holder, int position, List<Object> payloads) {

        super.onBindViewHolder(holder, position, payloads);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public TextView itemView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.itemView = (TextView) itemView.findViewById(R.id.card_recyclerview);
        }
    }
}
