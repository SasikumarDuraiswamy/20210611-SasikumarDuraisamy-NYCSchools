package com.android.chasenyc.viewmodels;
import android.content.Context;

import com.android.chasenyc.model.SchoolDetail;

public class SchoolDetailViewModel extends BaseViewModel<SchoolDetail> {

    public void init(String id, Context context){
        super.init();
        mutableLiveData = schoolRepository.getSchoolDetail(id, context);
    }

}
