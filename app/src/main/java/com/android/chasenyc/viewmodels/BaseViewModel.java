package com.android.chasenyc.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.android.chasenyc.model.SchoolDetail;
import com.android.chasenyc.networking.SchoolRepository;

import java.util.List;


public abstract class BaseViewModel<T> extends ViewModel {

    protected MutableLiveData<T> mutableLiveData;
    protected SchoolRepository schoolRepository;

    protected void init(){
        if (mutableLiveData != null){
            return;
        }
        schoolRepository = SchoolRepository.getInstance();
    }

    public LiveData<T> getSchoolRepository() {
        return mutableLiveData;
    }

}
