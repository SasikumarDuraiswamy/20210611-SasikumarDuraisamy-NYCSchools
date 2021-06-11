package com.android.chasenyc.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Class to hold the school item data
 */
public class School implements Parcelable {

    @SerializedName("dbn")
    @Expose
    public String dbn;
    @SerializedName("school_name")
    @Expose
    public String school_name;
    @SerializedName("boro")
    @Expose
    public String boro;
    @SerializedName("overview_paragraph")
    @Expose
    public String overview_paragraph;
    @SerializedName("school_10th_seats")
    @Expose
    public String school_10th_seats;
    @SerializedName("academicopportunities1")
    @Expose
    public String academicopportunities1;
    @SerializedName("academicopportunities2")
    @Expose
    public String academicopportunities2;
    @SerializedName("ell_programs")
    @Expose
    public String ell_programs;
    @SerializedName("neighborhood")
    @Expose
    public String neighborhood;
    @SerializedName("building_code")
    @Expose
    public String building_code;
    @SerializedName("location")
    @Expose
    public String location;
    @SerializedName("phone_number")
    @Expose
    public String phone_number;
    @SerializedName("fax_number")
    @Expose
    public String fax_number;
    @SerializedName("school_email")
    @Expose
    public String school_email;
    @SerializedName("website")
    @Expose
    public String website;
    @SerializedName("subway")
    @Expose
    public String subway;
    @SerializedName("bus")
    @Expose
    public String bus;
    @SerializedName("grades2018")
    @Expose
    public String grades2018;
    @SerializedName("finalgrades")
    @Expose
    public String finalgrades;
    @SerializedName("total_students")
    @Expose
    public String total_students;
    @SerializedName("extracurricular_activities")
    @Expose
    public String extracurricular_activities;
    @SerializedName("school_sports")
    @Expose
    public String school_sports;
    @SerializedName("attendance_rate")
    @Expose
    public String attendance_rate;
    @SerializedName("pct_stu_enough_variety")
    @Expose
    public String pct_stu_enough_variety;
    @SerializedName("pct_stu_safe")
    @Expose
    public String pct_stu_safe;
    @SerializedName("school_accessibility_description")
    @Expose
    public String school_accessibility_description;
    @SerializedName("directions1")
    @Expose
    public String directions1;
    @SerializedName("requirement1_1")
    @Expose
    public String requirement1_1;
    @SerializedName("requirement2_1")
    @Expose
    public String requirement2_1;
    @SerializedName("requirement3_1")
    @Expose
    public String requirement3_1;
    @SerializedName("requirement4_1")
    @Expose
    public String requirement4_1;
    @SerializedName("requirement5_1")
    @Expose
    public String requirement5_1;
    @SerializedName("offer_rate1")
    @Expose
    public String offer_rate1;
    @SerializedName("program1")
    @Expose
    public String program1;
    @SerializedName("code1")
    @Expose
    public String code1;
    @SerializedName("interest1")
    @Expose
    public String interest1;
    @SerializedName("method1")
    @Expose
    public String method1;
    @SerializedName("seats9ge1")
    @Expose
    public String seats9ge1;
    @SerializedName("grade9gefilledflag1")
    @Expose
    public String grade9gefilledflag1;
    @SerializedName("grade9geapplicants1")
    @Expose
    public String grade9geapplicants1;
    @SerializedName("seats9swd1")
    @Expose
    public String seats9swd1;
    @SerializedName("grade9swdfilledflag1")
    @Expose
    public String grade9swdfilledflag1;
    @SerializedName("grade9swdapplicants1")
    @Expose
    public String grade9swdapplicants1;
    @SerializedName("seats101")
    @Expose
    public String seats101;
    @SerializedName("admissionspriority11")
    @Expose
    public String admissionspriority11;
    @SerializedName("admissionspriority21")
    @Expose
    public String admissionspriority21;
    @SerializedName("admissionspriority31")
    @Expose
    public String admissionspriority31;
    @SerializedName("grade9geapplicantsperseat1")
    @Expose
    public String grade9geapplicantsperseat1;
    @SerializedName("grade9swdapplicantsperseat1")
    @Expose
    public String grade9swdapplicantsperseat1;
    @SerializedName("primary_address_line_1")
    @Expose
    public String primary_address_line_1;
    @SerializedName("city")
    @Expose
    public String city;
    @SerializedName("zip")
    @Expose
    public String zip;
    @SerializedName("state_code")
    @Expose
    public String state_code;
    @SerializedName("latitude")
    @Expose
    public String latitude;
    @SerializedName("longitude")
    @Expose
    public String longitude;
    @SerializedName("community_board")
    @Expose
    public String community_board;
    @SerializedName("council_district")
    @Expose
    public String council_district;
    @SerializedName("census_tract")
    @Expose
    public String census_tract;
    @SerializedName("bin")
    @Expose
    public String bin;
    @SerializedName("bbl")
    @Expose
    public String bbl;
    @SerializedName("nta")
    @Expose
    public String nta;
    @SerializedName("borough")
    @Expose
    public String borough;

    protected School(Parcel in) {
        dbn = in.readString();
        school_name = in.readString();
        boro = in.readString();
        overview_paragraph = in.readString();
        school_10th_seats = in.readString();
        academicopportunities1 = in.readString();
        academicopportunities2 = in.readString();
        ell_programs = in.readString();
        neighborhood = in.readString();
        building_code = in.readString();
        location = in.readString();
        phone_number = in.readString();
        fax_number = in.readString();
        school_email = in.readString();
        website = in.readString();
        subway = in.readString();
        bus = in.readString();
        grades2018 = in.readString();
        finalgrades = in.readString();
        total_students = in.readString();
        extracurricular_activities = in.readString();
        school_sports = in.readString();
        attendance_rate = in.readString();
        pct_stu_enough_variety = in.readString();
        pct_stu_safe = in.readString();
        school_accessibility_description = in.readString();
        directions1 = in.readString();
        requirement1_1 = in.readString();
        requirement2_1 = in.readString();
        requirement3_1 = in.readString();
        requirement4_1 = in.readString();
        requirement5_1 = in.readString();
        offer_rate1 = in.readString();
        program1 = in.readString();
        code1 = in.readString();
        interest1 = in.readString();
        method1 = in.readString();
        seats9ge1 = in.readString();
        grade9gefilledflag1 = in.readString();
        grade9geapplicants1 = in.readString();
        seats9swd1 = in.readString();
        grade9swdfilledflag1 = in.readString();
        grade9swdapplicants1 = in.readString();
        seats101 = in.readString();
        admissionspriority11 = in.readString();
        admissionspriority21 = in.readString();
        admissionspriority31 = in.readString();
        grade9geapplicantsperseat1 = in.readString();
        grade9swdapplicantsperseat1 = in.readString();
        primary_address_line_1 = in.readString();
        city = in.readString();
        zip = in.readString();
        state_code = in.readString();
        latitude = in.readString();
        longitude = in.readString();
        community_board = in.readString();
        council_district = in.readString();
        census_tract = in.readString();
        bin = in.readString();
        bbl = in.readString();
        nta = in.readString();
        borough = in.readString();
    }

    public static final Creator<School> CREATOR = new Creator<School>() {
        @Override
        public School createFromParcel(Parcel in) {
            return new School( in );
        }

        @Override
        public School[] newArray(int size) {
            return new School[size];
        }
    };

    public String getDbn() {
        return dbn;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getBoro() {
        return boro;
    }

    public void setBoro(String boro) {
        this.boro = boro;
    }

    public String getOverview_paragraph() {
        return overview_paragraph;
    }

    public void setOverview_paragraph(String overview_paragraph) {
        this.overview_paragraph = overview_paragraph;
    }

    public String getSchool_10th_seats() {
        return school_10th_seats;
    }

    public void setSchool_10th_seats(String school_10th_seats) {
        this.school_10th_seats = school_10th_seats;
    }

    public String getAcademicopportunities1() {
        return academicopportunities1;
    }

    public void setAcademicopportunities1(String academicopportunities1) {
        this.academicopportunities1 = academicopportunities1;
    }

    public String getAcademicopportunities2() {
        return academicopportunities2;
    }

    public void setAcademicopportunities2(String academicopportunities2) {
        this.academicopportunities2 = academicopportunities2;
    }

    public String getEll_programs() {
        return ell_programs;
    }

    public void setEll_programs(String ell_programs) {
        this.ell_programs = ell_programs;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getBuilding_code() {
        return building_code;
    }

    public void setBuilding_code(String building_code) {
        this.building_code = building_code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getFax_number() {
        return fax_number;
    }

    public void setFax_number(String fax_number) {
        this.fax_number = fax_number;
    }

    public String getSchool_email() {
        return school_email;
    }

    public void setSchool_email(String school_email) {
        this.school_email = school_email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSubway() {
        return subway;
    }

    public void setSubway(String subway) {
        this.subway = subway;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getGrades2018() {
        return grades2018;
    }

    public void setGrades2018(String grades2018) {
        this.grades2018 = grades2018;
    }

    public String getFinalgrades() {
        return finalgrades;
    }

    public void setFinalgrades(String finalgrades) {
        this.finalgrades = finalgrades;
    }

    public String getTotal_students() {
        return total_students;
    }

    public void setTotal_students(String total_students) {
        this.total_students = total_students;
    }

    public String getExtracurricular_activities() {
        return extracurricular_activities;
    }

    public void setExtracurricular_activities(String extracurricular_activities) {
        this.extracurricular_activities = extracurricular_activities;
    }

    public String getSchool_sports() {
        return school_sports;
    }

    public void setSchool_sports(String school_sports) {
        this.school_sports = school_sports;
    }

    public String getAttendance_rate() {
        return attendance_rate;
    }

    public void setAttendance_rate(String attendance_rate) {
        this.attendance_rate = attendance_rate;
    }

    public String getPct_stu_enough_variety() {
        return pct_stu_enough_variety;
    }

    public void setPct_stu_enough_variety(String pct_stu_enough_variety) {
        this.pct_stu_enough_variety = pct_stu_enough_variety;
    }

    public String getPct_stu_safe() {
        return pct_stu_safe;
    }

    public void setPct_stu_safe(String pct_stu_safe) {
        this.pct_stu_safe = pct_stu_safe;
    }

    public String getSchool_accessibility_description() {
        return school_accessibility_description;
    }

    public void setSchool_accessibility_description(String school_accessibility_description) {
        this.school_accessibility_description = school_accessibility_description;
    }

    public String getDirections1() {
        return directions1;
    }

    public void setDirections1(String directions1) {
        this.directions1 = directions1;
    }

    public String getRequirement1_1() {
        return requirement1_1;
    }

    public void setRequirement1_1(String requirement1_1) {
        this.requirement1_1 = requirement1_1;
    }

    public String getRequirement2_1() {
        return requirement2_1;
    }

    public void setRequirement2_1(String requirement2_1) {
        this.requirement2_1 = requirement2_1;
    }

    public String getRequirement3_1() {
        return requirement3_1;
    }

    public void setRequirement3_1(String requirement3_1) {
        this.requirement3_1 = requirement3_1;
    }

    public String getRequirement4_1() {
        return requirement4_1;
    }

    public void setRequirement4_1(String requirement4_1) {
        this.requirement4_1 = requirement4_1;
    }

    public String getRequirement5_1() {
        return requirement5_1;
    }

    public void setRequirement5_1(String requirement5_1) {
        this.requirement5_1 = requirement5_1;
    }

    public String getOffer_rate1() {
        return offer_rate1;
    }

    public void setOffer_rate1(String offer_rate1) {
        this.offer_rate1 = offer_rate1;
    }

    public String getProgram1() {
        return program1;
    }

    public void setProgram1(String program1) {
        this.program1 = program1;
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getInterest1() {
        return interest1;
    }

    public void setInterest1(String interest1) {
        this.interest1 = interest1;
    }

    public String getMethod1() {
        return method1;
    }

    public void setMethod1(String method1) {
        this.method1 = method1;
    }

    public String getSeats9ge1() {
        return seats9ge1;
    }

    public void setSeats9ge1(String seats9ge1) {
        this.seats9ge1 = seats9ge1;
    }

    public String getGrade9gefilledflag1() {
        return grade9gefilledflag1;
    }

    public void setGrade9gefilledflag1(String grade9gefilledflag1) {
        this.grade9gefilledflag1 = grade9gefilledflag1;
    }

    public String getGrade9geapplicants1() {
        return grade9geapplicants1;
    }

    public void setGrade9geapplicants1(String grade9geapplicants1) {
        this.grade9geapplicants1 = grade9geapplicants1;
    }

    public String getSeats9swd1() {
        return seats9swd1;
    }

    public void setSeats9swd1(String seats9swd1) {
        this.seats9swd1 = seats9swd1;
    }

    public String getGrade9swdfilledflag1() {
        return grade9swdfilledflag1;
    }

    public void setGrade9swdfilledflag1(String grade9swdfilledflag1) {
        this.grade9swdfilledflag1 = grade9swdfilledflag1;
    }

    public String getGrade9swdapplicants1() {
        return grade9swdapplicants1;
    }

    public void setGrade9swdapplicants1(String grade9swdapplicants1) {
        this.grade9swdapplicants1 = grade9swdapplicants1;
    }

    public String getSeats101() {
        return seats101;
    }

    public void setSeats101(String seats101) {
        this.seats101 = seats101;
    }

    public String getAdmissionspriority11() {
        return admissionspriority11;
    }

    public void setAdmissionspriority11(String admissionspriority11) {
        this.admissionspriority11 = admissionspriority11;
    }

    public String getAdmissionspriority21() {
        return admissionspriority21;
    }

    public void setAdmissionspriority21(String admissionspriority21) {
        this.admissionspriority21 = admissionspriority21;
    }

    public String getAdmissionspriority31() {
        return admissionspriority31;
    }

    public void setAdmissionspriority31(String admissionspriority31) {
        this.admissionspriority31 = admissionspriority31;
    }

    public String getGrade9geapplicantsperseat1() {
        return grade9geapplicantsperseat1;
    }

    public void setGrade9geapplicantsperseat1(String grade9geapplicantsperseat1) {
        this.grade9geapplicantsperseat1 = grade9geapplicantsperseat1;
    }

    public String getGrade9swdapplicantsperseat1() {
        return grade9swdapplicantsperseat1;
    }

    public void setGrade9swdapplicantsperseat1(String grade9swdapplicantsperseat1) {
        this.grade9swdapplicantsperseat1 = grade9swdapplicantsperseat1;
    }

    public String getPrimary_address_line_1() {
        return primary_address_line_1;
    }

    public void setPrimary_address_line_1(String primary_address_line_1) {
        this.primary_address_line_1 = primary_address_line_1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState_code() {
        return state_code;
    }

    public void setState_code(String state_code) {
        this.state_code = state_code;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCommunity_board() {
        return community_board;
    }

    public void setCommunity_board(String community_board) {
        this.community_board = community_board;
    }

    public String getCouncil_district() {
        return council_district;
    }

    public void setCouncil_district(String council_district) {
        this.council_district = council_district;
    }

    public String getCensus_tract() {
        return census_tract;
    }

    public void setCensus_tract(String census_tract) {
        this.census_tract = census_tract;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getBbl() {
        return bbl;
    }

    public void setBbl(String bbl) {
        this.bbl = bbl;
    }

    public String getNta() {
        return nta;
    }

    public void setNta(String nta) {
        this.nta = nta;
    }

    public String getBorough() {
        return borough;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }


    @Override
    public int describeContents() {
        return this.hashCode();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString( dbn );
        parcel.writeString( school_name );
        parcel.writeString( boro );
        parcel.writeString( overview_paragraph );
        parcel.writeString( school_10th_seats );
        parcel.writeString( academicopportunities1 );
        parcel.writeString( academicopportunities2 );
        parcel.writeString( ell_programs );
        parcel.writeString( neighborhood );
        parcel.writeString( building_code );
        parcel.writeString( location );
        parcel.writeString( phone_number );
        parcel.writeString( fax_number );
        parcel.writeString( school_email );
        parcel.writeString( website );
        parcel.writeString( subway );
        parcel.writeString( bus );
        parcel.writeString( grades2018 );
        parcel.writeString( finalgrades );
        parcel.writeString( total_students );
        parcel.writeString( extracurricular_activities );
        parcel.writeString( school_sports );
        parcel.writeString( attendance_rate );
        parcel.writeString( pct_stu_enough_variety );
        parcel.writeString( pct_stu_safe );
        parcel.writeString( school_accessibility_description );
        parcel.writeString( directions1 );
        parcel.writeString( requirement1_1 );
        parcel.writeString( requirement2_1 );
        parcel.writeString( requirement3_1 );
        parcel.writeString( requirement4_1 );
        parcel.writeString( requirement5_1 );
        parcel.writeString( offer_rate1 );
        parcel.writeString( program1 );
        parcel.writeString( code1 );
        parcel.writeString( interest1 );
        parcel.writeString( method1 );
        parcel.writeString( seats9ge1 );
        parcel.writeString( grade9gefilledflag1 );
        parcel.writeString( grade9geapplicants1 );
        parcel.writeString( seats9swd1 );
        parcel.writeString( grade9swdfilledflag1 );
        parcel.writeString( grade9swdapplicants1 );
        parcel.writeString( seats101 );
        parcel.writeString( admissionspriority11 );
        parcel.writeString( admissionspriority21 );
        parcel.writeString( admissionspriority31 );
        parcel.writeString( grade9geapplicantsperseat1 );
        parcel.writeString( grade9swdapplicantsperseat1 );
        parcel.writeString( primary_address_line_1 );
        parcel.writeString( city );
        parcel.writeString( zip );
        parcel.writeString( state_code );
        parcel.writeString( latitude );
        parcel.writeString( longitude );
        parcel.writeString( community_board );
        parcel.writeString( council_district );
        parcel.writeString( census_tract );
        parcel.writeString( bin );
        parcel.writeString( bbl );
        parcel.writeString( nta );
        parcel.writeString( borough );
    }
}
