package com.padcmyanmar.padc9.fragmenthw.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.padcmyanmar.padc9.fragmenthw.delegates.ItemDelegate;

public class NewestItemHolder extends RecyclerView.ViewHolder {

    private ItemDelegate itemDelegate;

    public NewestItemHolder(@NonNull final View itemView, ItemDelegate mItemDelegate) {

        super(itemView);

        itemDelegate = mItemDelegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemDelegate.onTapItem();
            }
        });
    }
}
