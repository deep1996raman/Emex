package com.example.android.emex.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by abc on 14-Apr-17.
 */

public class JobHistoryModel implements Parcelable {
    public static final Creator<JobHistoryModel> CREATOR = new Creator<JobHistoryModel>() {
        @Override
        public JobHistoryModel createFromParcel(Parcel in) {
            return new JobHistoryModel(in);
        }

        @Override
        public JobHistoryModel[] newArray(int size) {
            return new JobHistoryModel[size];
        }
    };
   private String mDateAndTime,mDriverName,mDistance,mPickupLocation,mDestination;

    public JobHistoryModel(String mDateAndTime, String mDriverName, String mDistance, String mPickupLocation, String mDestination) {
        this.mDateAndTime = mDateAndTime;
        this.mDriverName = mDriverName;
        this.mDistance = mDistance;
        this.mPickupLocation = mPickupLocation;
        this.mDestination = mDestination;
    }

    protected JobHistoryModel(Parcel in) {
        mDateAndTime = in.readString();
        mDriverName = in.readString();
        mDistance = in.readString();
        mPickupLocation = in.readString();
        mDestination = in.readString();
    }



    public String getmDateAndTime() {
        return mDateAndTime;
    }

    public void setmDateAndTime(String mDateAndTime) {
        this.mDateAndTime = mDateAndTime;
    }

    public String getmDriverName() {
        return mDriverName;
    }

    public void setmDriverName(String mDriverName) {
        this.mDriverName = mDriverName;
    }

    public String getmDistance() {
        return mDistance;
    }

    public void setmDistance(String mDistance) {
        this.mDistance = mDistance;
    }

    public String getmPickupLocation() {
        return mPickupLocation;
    }

    public void setmPickupLocation(String mPickupLocation) {
        this.mPickupLocation = mPickupLocation;
    }

    public String getmDestination() {
        return mDestination;
    }

    public void setmDestination(String mDestination) {
        this.mDestination = mDestination;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mDateAndTime);
        dest.writeString(mDriverName);
        dest.writeString(mDistance);
        dest.writeString(mPickupLocation);
        dest.writeString(mDestination);
    }
}
