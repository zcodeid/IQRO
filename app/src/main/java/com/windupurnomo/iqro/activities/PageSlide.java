package com.windupurnomo.iqro.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager;

import com.windupurnomo.iqro.fragments.SlideFragment;
import com.windupurnomo.iqro.models.Letter;
import com.windupurnomo.iqro.models.Shared;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PageSlide extends FragmentActivity {
    private int NUM_PAGES;
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;
    private List<Letter> letters = new ArrayList<Letter>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        letters = Shared.letters;
        NUM_PAGES = letters.size();
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_page_slide);
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mPager.setCurrentItem(mPager.getChildCount() * 1000/2, false);
        mPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                invalidateOptionsMenu();
            }
        });
        getOverflowMenu();
    }

    private void getOverflowMenu() {
        try {
            ViewConfiguration config = ViewConfiguration.get(this);
            Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if (menuKeyField != null) {
                menuKeyField.setAccessible(true);
                menuKeyField.setBoolean(config, false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
            initWhiteList();
        }

        @Override
        public Fragment getItem(int position) {
            position = position % letters.size();
            if (position == letters.size()-1)
                Collections.shuffle(whiteList);
            Shared.selectedLetter = letters.get(whiteList.get(position));
            return new SlideFragment();
        }

        @Override
        public int getCount() {
            return NUM_PAGES * 1000;
        }

        private List<Integer> whiteList = new ArrayList<>();
        private void initWhiteList(){
            for (int i = 0; i<letters.size(); i++){
                whiteList.add(i);
            }
        }
    }

}
