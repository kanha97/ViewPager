package com.devkanhaiya.viewpagerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;

public class CustomAdapter extends PagerAdapter {

    Context ctx;

    public CustomAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        Model model=Model.values()[position];
        View view = LayoutInflater.from(ctx).inflate(model.getmLayoutResId(),container,false);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
    container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return Model.values().length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        Model model = Model.values()[position];
        return ctx.getString(model.getmTitleResId());
    }
}
