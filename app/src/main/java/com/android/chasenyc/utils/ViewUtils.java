package com.android.chasenyc.utils;

import android.text.TextUtils;
import android.view.View;

public class ViewUtils {

    /**
     * Method to return the view visibility based on the value
     * @param value - If the value is empty or null it return gone otherwise visible
     * @return Integer
     */
    public static int isVisible(String value){
        return !TextUtils.isEmpty( value ) ? View.VISIBLE : View.GONE;
    }

    /**
     * Method to return the trimed value, if the value is not null or empty
     * @param value - String have to trim
     * @return - String
     */
    public static String getTrimValue(String value){
        return null != value? value.trim() : value;
    }
}
