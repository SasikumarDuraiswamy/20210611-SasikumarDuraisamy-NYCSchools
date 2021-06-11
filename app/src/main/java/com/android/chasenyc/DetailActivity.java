package com.android.chasenyc;

import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.android.chasenyc.model.School;
import com.android.chasenyc.model.SchoolDetail;
import com.android.chasenyc.viewmodels.SchoolDetailViewModel;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.android.chasenyc.utils.ViewUtils.getTrimValue;
import static com.android.chasenyc.utils.ViewUtils.isVisible;

public class DetailActivity extends AppCompatActivity implements OnMapReadyCallback {

    SchoolDetailViewModel mSchoolDetailViewModel;

    public static String SCHOOL = "SCHOOL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Method to set the initial view with the previous screen data
        String id = setView();

        mSchoolDetailViewModel = ViewModelProviders.of(this).get( SchoolDetailViewModel.class);
        mSchoolDetailViewModel.init(id, this);
        mSchoolDetailViewModel.getSchoolRepository().observe(this, schoolResponse -> {
            setDetailData(schoolResponse);
        });
    }

    /**
     * Manipulates the map when it's available.
     * The API invokes this callback when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user receives a prompt to install
     * Play services inside the SupportMapFragment. The API invokes this method after the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        School school = getIntent().getParcelableExtra( SCHOOL );
        // [START_EXCLUDE silent]
        // Add a marker in Sydney, Australia,
        // and move the map's camera to the same location.
        // [END_EXCLUDE]
        LatLng sydney = new LatLng(Double.valueOf(school.getLatitude()),
                Double.valueOf(school.getLatitude()));
        googleMap.addMarker(new MarkerOptions()
                .position(sydney)
                .title("Marker in Sydney"));
        // [START_EXCLUDE silent]
        googleMap.moveCamera( CameraUpdateFactory.newLatLng(sydney));
        // [END_EXCLUDE]
    }

    /**
     * Method to set the detail with the bundle data
     */
    private String setView(){
        School school = getIntent().getParcelableExtra( SCHOOL );
        TextView schoolName = findViewById(R.id.school_name );
        schoolName.setText(school.getSchool_name());

        TextView schoolPhone = findViewById(R.id.school_phone );
        //Set the number linkify to highlight the phone number
        schoolPhone.setAutoLinkMask( Linkify.PHONE_NUMBERS);
        schoolPhone.setText(school.getPhone_number());

        TextView schoolWebSite = findViewById(R.id.school_website );
        //Set the number linkify to highlight the web sides
        schoolWebSite.setAutoLinkMask( Linkify.WEB_URLS);
        schoolWebSite.setText(school.getWebsite());
        schoolWebSite.setVisibility(isVisible( school.getWebsite() ) );

        TextView schoolEmail = findViewById(R.id.school_email );
        //Set the number linkify to highlight the Email address.
        schoolEmail.setAutoLinkMask( Linkify.EMAIL_ADDRESSES);
        schoolEmail.setText(school.getSchool_email());
        schoolEmail.setVisibility( isVisible( school.getSchool_email() ) );

        TextView schoolSports = findViewById(R.id.school_sports );
        schoolSports.setText(school.getSchool_sports());
        schoolSports.setVisibility( isVisible( school.getSchool_sports() ) );

        TextView schoolId = findViewById(R.id.school_id );
        schoolId.setText(getTrimValue(school.getDbn()));

        TextView schoolCity = findViewById(R.id.school_city );
        schoolCity.setText(getTrimValue(school.getCity()));
        schoolCity.setVisibility( isVisible( school.getCity() ) );

        TextView schoolState = findViewById(R.id.school_state );
        schoolState.setText(getTrimValue(school.getState_code()));
        schoolState.setVisibility( isVisible( school.getState_code() ) );

        TextView schoolZipCode = findViewById(R.id.school_zipcode );
        schoolZipCode.setText(getTrimValue(school.getZip()));
        schoolZipCode.setVisibility( isVisible( school.getZip() ) );

        TextView schoolAddress = findViewById(R.id.school_address );
        schoolAddress.setText(getTrimValue(school.getPrimary_address_line_1()));
        schoolAddress.setVisibility( isVisible( school.getPrimary_address_line_1() ) );

        if(isVisible(school.getLatitude()) == View.VISIBLE && isVisible( school.getLongitude() ) == View.VISIBLE) {
            // Get the SupportMapFragment and request notification when the map is ready to be used.
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById( R.id.map );
            mapFragment.getMapAsync( this );
        }
        return school.getDbn();
    }

    private void setDetailData(SchoolDetail schoolDetail){
        if(null != schoolDetail) {
            TextView schoolZipCode = findViewById( R.id.school_title );
            schoolZipCode.setText( getTrimValue( schoolDetail.getSchoolName() ) );
            schoolZipCode.setVisibility( isVisible( schoolDetail.getSchoolName() ) );

            TextView testTaken =  findViewById( R.id.text_taken );
            testTaken.setText( schoolDetail.getNumOfSatTestTakers() );
            testTaken.setVisibility( View.VISIBLE );

            TextView reading =  findViewById( R.id.reading_score );
            reading.setText( schoolDetail.getSatCriticalReadingAvgScore() );
            reading.setVisibility( View.VISIBLE );

            TextView mathScore =  findViewById( R.id.math_score );
            mathScore.setText( schoolDetail.getSatMathAvgScore() );
            mathScore.setVisibility( View.VISIBLE );

            TextView writingScore =  findViewById( R.id.writing_score );
            writingScore.setText( schoolDetail.getSatWritingAvgScore() );
            writingScore.setVisibility( View.VISIBLE );
        }
    }
}
