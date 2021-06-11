package com.android.chasenyc.viewmodels;

import com.android.chasenyc.model.School;

import java.util.List;

public class SchoolListViewModel extends BaseViewModel<List<School>> {

    public void init(){
       super.init();
        mutableLiveData = schoolRepository.getSchool();
    }
}
