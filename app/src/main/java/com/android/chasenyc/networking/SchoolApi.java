package com.android.chasenyc.networking;

import com.android.chasenyc.model.School;
import com.android.chasenyc.model.SchoolDetail;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Facade to make the api call via retrofit
 */
public interface SchoolApi {

    @GET("api/id/s3k6-pzi2.json")
    Call<List<School>> getSchoolList();

    @GET("api/id/f9bf-2cp4.json")
    Call<List<SchoolDetail>> getSchoolDetail();
}
