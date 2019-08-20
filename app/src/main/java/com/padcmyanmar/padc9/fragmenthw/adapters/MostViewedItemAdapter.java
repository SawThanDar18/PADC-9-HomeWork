package com.padcmyanmar.padc9.fragmenthw.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.padc9.fragmenthw.R;
import com.padcmyanmar.padc9.fragmenthw.delegates.ItemDelegate;
import com.padcmyanmar.padc9.fragmenthw.holders.MostViewedItemHolder;

public class MostViewedItemAdapter extends RecyclerView.Adapter {

    private ItemDelegate itemDelegate;

    public MostViewedItemAdapter(ItemDelegate itemDelegate) {
        this.itemDelegate = itemDelegate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_mostviewed_item, viewGroup, false);
        return new MostViewedItemHolder(view, itemDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
