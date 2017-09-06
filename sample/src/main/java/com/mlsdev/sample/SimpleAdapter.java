package com.mlsdev.sample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {

    public final int itemCount = 50;
    private int[] backgrounds = new int[3];

    public SimpleAdapter() {
        backgrounds[0] = R.drawable.background_primary_light;
        backgrounds[1] = R.drawable.background_primary_dark;
        backgrounds[2] = R.drawable.background_primary_accent;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        int index = (int) (Math.random() * 3);
        holder.view.setBackgroundResource(backgrounds[index]);
    }

    @Override
    public int getItemCount() {
        return itemCount;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private FrameLayout view;

        public ViewHolder(View itemView) {
            super(itemView);
            view = (FrameLayout) itemView.findViewById(R.id.item);
        }
    }
}
