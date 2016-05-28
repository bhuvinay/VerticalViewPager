package com.glass.round.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Vinay on 27/05/16.
 */
public class MainActivity extends ActionBarActivity {

    // private ViewPager mViewPager;
    private VerticalViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.intro_layout);
        initViewpager();

    }

    private void initViewpager() {
        VerticalViewPager walkThroughPager = (VerticalViewPager) findViewById(R.id.vertical_viewpager);
        if (walkThroughPager != null) {
            walkThroughPager.setAdapter(new HomeScreenPagerAdapter(getApplicationContext()));
            walkThroughPager.setOffscreenPageLimit(HomeScreenPagerAdapter.WALKTHROUGH_PAGES_COUNT);
        }

    }


}
