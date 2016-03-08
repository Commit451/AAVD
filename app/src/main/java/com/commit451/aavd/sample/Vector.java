package com.commit451.aavd.sample;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;

/**
 * An item within the list
 */
public class Vector {

    public String name;
    public AnimatedVectorDrawableCompat activeDrawable;
    public AnimatedVectorDrawableCompat unactiveDrawable;
    public boolean active;

    public Vector(Context context, String name, @DrawableRes int activeDrawableResId, @DrawableRes int unactiveDrawableResId) {
        this.name = name;
        activeDrawable = AnimatedVectorDrawableCompat.create(context, activeDrawableResId);
        unactiveDrawable = AnimatedVectorDrawableCompat.create(context, unactiveDrawableResId);
        this.active = false;
    }
}
