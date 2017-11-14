package com.codepath.android.themeswitcher.app.util;

import android.app.Activity;
import android.content.Intent;

import com.codepath.android.themeswitcher.app.R;

/**
 * Created by Jake on 10/18/2017.
 */

public class Utils {
    private static int sTheme;

    public final static int THEME_MATERIAL_LIGHT = 0;
    public final static int THEME_BREAKOUT_SIXTEEN = 1;

    public static void changeToTheme(Activity activity, int theme) {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
        activity.overridePendingTransition(android.R.anim.fade_in,
                android.R.anim.fade_out);
    }

    public static void onActivityCreateSetTheme(Activity activity) {
        switch (sTheme) {
            default:
            case THEME_MATERIAL_LIGHT:
                activity.setTheme(R.style.Theme_Material_Light);
                break;
            case THEME_BREAKOUT_SIXTEEN:
                activity.setTheme(R.style.Theme_Breakout_Sixteen);
                break;
        }
    }
}