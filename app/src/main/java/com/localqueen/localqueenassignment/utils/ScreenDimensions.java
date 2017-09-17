package com.localqueen.localqueenassignment.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

import static java.security.AccessController.getContext;

/**
 * Created by haseeb on 17/9/17.
 */

public class ScreenDimensions {

    public static int getScreenWidth(Context context){
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        return width;
    }
}
