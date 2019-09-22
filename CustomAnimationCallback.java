package com.example.TimeSportv2.common.Animation;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

public abstract class CustomAnimationCallback extends Animatable2Compat.AnimationCallback {

    @Override
    public void onAnimationStart(Drawable drawable)
    {
        onStart(drawable);
    }

    @Override
    public void onAnimationEnd(Drawable drawable)
    {
        onEnd(drawable);
    }

    public abstract void onStart(Drawable drawable);
    public abstract void onEnd(Drawable drawable);
}
