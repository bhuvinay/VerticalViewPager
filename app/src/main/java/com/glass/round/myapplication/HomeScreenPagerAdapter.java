package com.glass.round.myapplication;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.PagerAdapter;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * This adapter is used for inflating views in OnBoarding
 * Screen view pager
 *
 * @author Akash Rai
 * @version 1.0
 * @since 1.0
 */
public class HomeScreenPagerAdapter extends PagerAdapter {
    private Context mContext;
    public static final int WALKTHROUGH_PAGES_COUNT = 4;
    private String[] mWalkThroughItemStringList;
    private TypedArray mOnBoardingScreenImageList;

    public HomeScreenPagerAdapter(Context context) {
        mContext = context;
        mWalkThroughItemStringList = mContext.getResources().getStringArray(R.array.on_boarding_screen_item_list);
        mOnBoardingScreenImageList = mContext.getResources().obtainTypedArray(R.array.walkthrough_image_list);
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.layout_walk_through_screen_tuple, collection, false);
        ImageView onBoardingScreen = (ImageView) layout.findViewById(R.id.iv_on_boarding_screen);
        onBoardingScreen.setImageResource(mOnBoardingScreenImageList.getResourceId(position, -1));
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return WALKTHROUGH_PAGES_COUNT;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


}
