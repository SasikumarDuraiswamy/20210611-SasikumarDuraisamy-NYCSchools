package com.android.chasenyc.networking;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import com.android.chasenyc.model.School;
import com.android.chasenyc.model.SchoolDetail;
import com.android.chasenyc.utils.SharePreferenceUtils;
import com.google.android.gms.common.util.SharedPreferencesUtils;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SchoolRepository {

    private static SchoolRepository mSchoolRepository;

    private SchoolApi mSchoolApi;

    public SchoolRepository(){
        mSchoolApi = RetrofitService.createService( SchoolApi.class);
    }

    /**
     * Method to create the single instance for repository
     * @return - School Repository instance.
     */
    public static SchoolRepository getInstance(){
        if (mSchoolRepository == null){
            mSchoolRepository = new SchoolRepository();
        }
        return mSchoolRepository;
    }

    /**
     * Method to get make the api call and get the list of the school item on async way
     * @return - MutableLiveData
     */
    public MutableLiveData<List<School>> getSchool(){
        MutableLiveData<List<School>> schoolData = new MutableLiveData<>();
        mSchoolApi.getSchoolList().enqueue( new Callback<List<School>>() {
            @Override
            public void onResponse(Call<List<School>> call,
                                   Response<List<School>> response) {
                if (response.isSuccessful()){
                    schoolData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<School>> call, Throwable t) {
                schoolData.setValue(null);
            }
        });
        return schoolData;
    }

    /**
     * Method to get make the api call and get the list of the school Details on async way
     * @return - MutableLiveData
     */
    public MutableLiveData<SchoolDetail> getSchoolDetail(String adbId, Context context){
        MutableLiveData<SchoolDetail> schoolData = new MutableLiveData<>();
        SchoolDetail schoolDetail = SharePreferenceUtils.getInstance().getSchoolDetail(context,adbId );
        if(null != schoolDetail){
            schoolData.setValue( schoolDetail );
        } else {
            mSchoolApi.getSchoolDetail().enqueue( new Callback<List<SchoolDetail>>() {
                @Override
                public void onResponse(Call<List<SchoolDetail>> call,
                                       Response<List<SchoolDetail>> response) {
                    if (response.isSuccessful()) {
                        schoolData.setValue(getSchoolDetail(adbId, response.body(), context)  );
                    }
                }

                @Override
                public void onFailure(Call<List<SchoolDetail>> call, Throwable t) {
                    schoolData.setValue( null );
                }
            } );
        }
        return schoolData;
    }

    private SchoolDetail getSchoolDetail(String dbnId, List<SchoolDetail> schoolDetails, Context context){
        SchoolDetail detail = null;
        if(!schoolDetails.isEmpty()){
            for(SchoolDetail schoolDetail: schoolDetails){
                SharePreferenceUtils.getInstance().setSchoolList(context, schoolDetail );
                if(schoolDetail.getDbn().equals( dbnId)) detail = schoolDetail;
            }
        }
        return detail;
    }
}
