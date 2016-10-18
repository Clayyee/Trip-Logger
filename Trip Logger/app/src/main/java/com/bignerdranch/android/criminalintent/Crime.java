package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private String mDestination;
    private String mTripType;
    private String mDuration;
    private String mComment;
    private Date mDate;
    private boolean mSolved;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }


    public void setDestination(String destination) {mDestination = destination;}

    public String getDestination() {
        return mDestination;
    }


    public void setTripType(String triptype) {mTripType = triptype;}

    public String getTripType() {
        return mTripType;
    }


    public void setDuration(String duration) {mDuration = duration;}

    public String getDuration() {
        return mDuration;
    }


    public void setComment(String comment) {mComment = comment;}

    public String getComment() {
        return mComment;
    }

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
