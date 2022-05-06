package com.example.androidintermediatejava.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.androidintermediatejava.R;
import com.example.androidintermediatejava.adapter.SlideViewPagerAdapter;
import com.example.androidintermediatejava.fragment.FirstSlideFragment;
import com.example.androidintermediatejava.fragment.SecondSlideFragment;
import com.example.androidintermediatejava.fragment.ThreeSlideFragment;

public class SlideActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        initViews();
    }

    private void initViews() {
        viewPager = findViewById(R.id.viewPager);
        //noinspection deprecation
        SlideViewPagerAdapter adapter = new SlideViewPagerAdapter(getSupportFragmentManager(),
                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapter.addFragment(new FirstSlideFragment());
        adapter.addFragment(new SecondSlideFragment());
        adapter.addFragment(new ThreeSlideFragment());
        viewPager.setAdapter(adapter);
    }
}