package com.glass.round.myapplication;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Vinay on 27/05/16.
 */
public class VPagerAdapter extends FragmentPagerAdapter {

    public VPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return VPagerFragment.newInstance(Color.parseColor("#03A9F4"), position); // blue
            case 1:
                return VPagerFragment.newInstance(Color.parseColor("#4CAF50"), position); // green
            default:
                return VPagerFragment.newInstance(Color.parseColor("#ffe63b"), position); // yellow the dirty fellow
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

}

