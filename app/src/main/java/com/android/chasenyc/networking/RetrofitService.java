package com.android.chasenyc.networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Class is the retrofit service
 */
public class RetrofitService {

    //Variable to hold the retrofit builder instance
    private static Retrofit mRetrofit = new Retrofit.Builder()
            .baseUrl("https://data.cityofnewyork.us/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    /**
     * Method to create the retrofit service for the S class
     * @param serviceClass - Class to be accept for the service
     * @param <S> - Service Class
     * @return - Interface of the service
     */
    public static <S> S createService(Class<S> serviceClass) {
        return mRetrofit.create(serviceClass);
    }

}
