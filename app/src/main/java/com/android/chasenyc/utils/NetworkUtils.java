package com.android.chasenyc.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;

import androidx.annotation.RequiresApi;

class NetworkUtils {

    /**
     *
     * Method to check the network is connected or not
     * @param context, context of the network checking class or application context
     *
     * @return Boolean. TRUE - If the device have the active network
     *                  False - If the device not have the active network.
     *
     */
    @RequiresApi(api = Build.VERSION_CODES.M)
    public static boolean isNetworkConnected(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        Network activeNetwork = connectivityManager.getActiveNetwork();
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities != null &&
                networkCapabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET);
    }
}
