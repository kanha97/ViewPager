package com.devkanhaiya.viewpagerapp;

public enum Model {

    RED(R.string.red,R.layout.view_red),
    BLUE(R.string.blue,R.layout.view_blue),
    YELLOW(R.string.yellow,R.layout.view_yellow);

    private int mTitleResId;
    private int mLayoutResId;

    Model(int mtitleResId, int mlayoutResId) {
        this.mTitleResId = mtitleResId;
        this.mLayoutResId = mlayoutResId;
    }

    public int getmTitleResId() {
        return mTitleResId;
    }

    public int getmLayoutResId() {
        return mLayoutResId;
    }
}
