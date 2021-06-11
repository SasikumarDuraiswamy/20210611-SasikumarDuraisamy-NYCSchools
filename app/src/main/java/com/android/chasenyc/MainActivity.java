package com.android.chasenyc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.chasenyc.model.School;
import com.android.chasenyc.adapters.SchoolAdapter;
import com.android.chasenyc.viewmodels.SchoolListViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SchoolAdapter.OnClickListener {

    ArrayList<School> articleArrayList = new ArrayList<>();
    SchoolAdapter schoolAdapter;
    RecyclerView schoolItemView;
    SchoolListViewModel schoolViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        schoolItemView = findViewById(R.id.school_list );
        schoolViewModel = ViewModelProviders.of(this).get( SchoolListViewModel.class);
        schoolViewModel.init();
        schoolViewModel.getSchoolRepository().observe(this, schoolResponse -> {
            articleArrayList.addAll( schoolResponse );
            schoolAdapter.notifyDataSetChanged();
        });

        setupRecyclerView();
    }

    private void setupRecyclerView() {
        if (schoolAdapter == null) {
            schoolAdapter = new SchoolAdapter(MainActivity.this, articleArrayList, this);
            schoolItemView.setLayoutManager(new LinearLayoutManager(this));
            schoolItemView.setAdapter( schoolAdapter );
            schoolItemView.setItemAnimator(new DefaultItemAnimator());
            schoolItemView.setNestedScrollingEnabled(true);
        } else {
            schoolAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onClick(School school) {
        Intent detailIntent = new Intent(this, DetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable( DetailActivity.SCHOOL, school );
        detailIntent.putExtras( bundle );
        startActivity( detailIntent );
    }
}
