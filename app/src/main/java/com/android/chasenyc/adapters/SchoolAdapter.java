package com.android.chasenyc.adapters;

import android.content.Context;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.chasenyc.R;
import com.android.chasenyc.model.School;

import java.util.ArrayList;

import static com.android.chasenyc.utils.ViewUtils.getTrimValue;
import static com.android.chasenyc.utils.ViewUtils.isVisible;

public class SchoolAdapter extends RecyclerView.Adapter<SchoolAdapter.SchoolViewHolder> implements View.OnClickListener {

    //Hold the current context of the adapter
    private Context mContext;

    //Hold the school list items to render into the view
    private ArrayList<School> mSchools;

    //Hold this to send the view holder onclick to callback class
    private OnClickListener mOnClickListener;

    //Hold this to set the item position of the view holder
    private static final int POSITION = 1;

    /**
     * Initialize the adapter with the required parameter
     * @param mContext - Current Context
     * @param mSchools - List items
     * @param onClickListener - action event
     */
    public SchoolAdapter(Context mContext, ArrayList<School> mSchools, OnClickListener onClickListener) {
        this.mContext = mContext;
        this.mSchools = mSchools;
        this.mOnClickListener = onClickListener;
    }

    @NonNull
    @Override
    public SchoolViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( mContext ).inflate( R.layout.school_item, parent, false);
        return new SchoolViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SchoolViewHolder holder, int position) {
        School school = mSchools.get(position);
        holder.schoolName.setText(school.getSchool_name());
        holder.schoolPhone.setText(school.getPhone_number());

        holder.schoolWebSite.setText(school.getWebsite());
        holder.schoolWebSite.setVisibility(isVisible( school.getWebsite() ) );

        holder.schoolEmail.setText(school.getSchool_email());
        holder.schoolEmail.setVisibility( isVisible( school.getSchool_email() ) );

        holder.schoolSports.setText(school.getSchool_sports());
        holder.schoolSports.setVisibility( isVisible( school.getSchool_sports() ) );

        holder.schoolCity.setText(getTrimValue(school.getCity()));
        holder.schoolCity.setVisibility( isVisible( school.getCity() ) );

        holder.schoolState.setText(getTrimValue(school.getState_code()));
        holder.schoolState.setVisibility( isVisible( school.getState_code() ) );

        holder.schoolZipCode.setText(getTrimValue(school.getZip()));
        holder.schoolZipCode.setVisibility( isVisible( school.getZip() ) );

        holder.schoolId.setText(getTrimValue(school.getDbn()));
        holder.itemView.setOnClickListener(this);
        holder.itemView.setTag(position );
    }

    @Override
    public int getItemCount() {
        return mSchools.size();
    }

    @Override
    public void onClick(View view) {
        if(null != mOnClickListener){
            mOnClickListener.onClick( mSchools.get( (int)view.getTag() ) );
        }
    }

    /**
     * Instance Class of the Recycler ViewHolder.
     */
    public class SchoolViewHolder extends RecyclerView.ViewHolder{
        //Textview hold the school name view
        TextView schoolName;
        //Textview hold the phone view and it mapped with linkify
        TextView schoolPhone;
        //Textview hold the website view and it mapped with linkify
        TextView schoolWebSite;
        //Textview hold the sports view
        TextView schoolSports;
        //Textview hold the schoolid view
        TextView schoolId;
        //Textview hold the city view
        TextView schoolCity;
        //Textview hold the state view
        TextView schoolState;
        //Textview hold the zipcode view
        TextView schoolZipCode;
        //Textview hold the email view and it mapped with linkify
        TextView schoolEmail;

        public SchoolViewHolder(@NonNull View itemView) {
            super(itemView);

            schoolName = itemView.findViewById(R.id.school_name );

            schoolPhone = itemView.findViewById(R.id.school_phone );
            //Set the number linkify to highlight the phone number
            schoolPhone.setAutoLinkMask( Linkify.PHONE_NUMBERS);

            schoolWebSite = itemView.findViewById(R.id.school_website );
            //Set the number linkify to highlight the web sides
            schoolWebSite.setAutoLinkMask( Linkify.WEB_URLS);

            schoolEmail = itemView.findViewById(R.id.school_email );
            //Set the number linkify to highlight the Email address.
            schoolEmail.setAutoLinkMask( Linkify.EMAIL_ADDRESSES);

            schoolSports = itemView.findViewById(R.id.school_sports );
            schoolId = itemView.findViewById(R.id.school_id );
            schoolCity = itemView.findViewById(R.id.school_city );
            schoolState = itemView.findViewById(R.id.school_state );
            schoolZipCode = itemView.findViewById(R.id.school_zipcode );
        }
    }

    /**
     * Interface to hold the onclick event to send the school object to callback class.
     */
    public interface OnClickListener {
        /**
         * Onclick method to trigger when tab on the school item
         * @param school - ViewHolder object of the school item
         */
        void onClick(School school);
    }
}
