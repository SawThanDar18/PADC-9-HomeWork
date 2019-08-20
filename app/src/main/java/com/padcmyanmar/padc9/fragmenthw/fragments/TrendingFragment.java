package com.padcmyanmar.padc9.fragmenthw.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.padc9.fragmenthw.R;
import com.padcmyanmar.padc9.fragmenthw.acitivties.TrendingDetailActivity;
import com.padcmyanmar.padc9.fragmenthw.adapters.TrendingItemAdapter;
import com.padcmyanmar.padc9.fragmenthw.delegates.ItemDelegate;

public class TrendingFragment extends Fragment implements ItemDelegate {

    public TrendingFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));

        TrendingItemAdapter trendingItemAdapter = new TrendingItemAdapter(this);
        recyclerView.setAdapter(trendingItemAdapter);
    }

    @Override
    public void onTapItem() {
        Intent intent = new Intent(getContext(), TrendingDetailActivity.class);
        startActivity(intent);
    }
}
