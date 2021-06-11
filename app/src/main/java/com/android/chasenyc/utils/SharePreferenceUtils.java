package com.android.chasenyc.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.android.chasenyc.model.SchoolDetail;
import com.google.gson.Gson;

public class SharePreferenceUtils {

    private static SharePreferenceUtils mSharePreferenceUtils;

    private static final String NAME = "ChaseNyc";

    public static SharePreferenceUtils getInstance(){
        if(null == mSharePreferenceUtils){
            mSharePreferenceUtils = new SharePreferenceUtils();

        }
        return mSharePreferenceUtils;
    }

    public SchoolDetail getSchoolDetail(Context context, String key){
        SchoolDetail schoolDetail = null;
        SharedPreferences sharedPreferences = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        String details = sharedPreferences.getString( key, null);
        if(!TextUtils.isEmpty( details )){
            schoolDetail = (new Gson()).fromJson( details, SchoolDetail.class);
        }
        return schoolDetail;
    }

    public void setSchoolList(Context context, SchoolDetail schoolDetail){
        SharedPreferences sharedPreferences = context.getSharedPreferences( NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String detail = (new Gson()).toJson( schoolDetail );
        editor.putString( schoolDetail.getDbn(), detail );
        editor.apply();
    }

}
