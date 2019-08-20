package com.padcmyanmar.padc9.fragmenthw.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.padcmyanmar.padc9.fragmenthw.R;
import com.padcmyanmar.padc9.fragmenthw.fragments.MostViewedFragment;
import com.padcmyanmar.padc9.fragmenthw.fragments.NewestFragment;
import com.padcmyanmar.padc9.fragmenthw.fragments.TrendingFragment;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i == 0){
            return new NewestFragment();
        }else if(i == 1){
            return new TrendingFragment();
        }else return new MostViewedFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return  "Newest";
        }else if(position == 1){
            return "Trending";
        }else return "Most Viewed";
    }
}
