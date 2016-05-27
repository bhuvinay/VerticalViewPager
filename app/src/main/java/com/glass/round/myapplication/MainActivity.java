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

        mViewPager = (VerticalViewPager) findViewById(R.id.vertical_viewpager);

        // Set an Adapter on the ViewPager
        mViewPager.setAdapter(new VPagerAdapter(getSupportFragmentManager()));

        // Set a PageTransformer
      //  mViewPager.setPageTransformer(false, new VPageTransformer());
    }

}
