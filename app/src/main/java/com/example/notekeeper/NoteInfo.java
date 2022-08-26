package com.example.notekeeper;

import android.os.Parcel;
import android.os.Parcelable;

public final class NoteInfo implements Parcelable {
private courseInfo mCourse;
private String mTitle;
private String mText;

    public NoteInfo(courseInfo mCourse, String mTitle, String mText) {
        this.mCourse = mCourse;
        this.mTitle = mTitle;
        this.mText = mText;
    }

    protected NoteInfo(Parcel in) {
        mCourse = in.readParcelable(courseInfo.class.getClassLoader());
        mTitle = in.readString();
        mText = in.readString();
    }

    public static final Creator<NoteInfo> CREATOR = new Creator<NoteInfo>() {
        @Override
        public NoteInfo createFromParcel(Parcel in) {
            return new NoteInfo(in);
        }

        @Override
        public NoteInfo[] newArray(int size) {
            return new NoteInfo[size];
        }
    };

    public courseInfo getmCourse() {return mCourse;}
    public void setmCourse(courseInfo mCourse) {this.mCourse = mCourse;}

    public String getmTitle() {return mTitle;}
    public void setmTitle(String mTitle) {this.mTitle = mTitle;}

    public String getmText() {return mText;}
    public void setmText(String mText) {this.mText = mText;}


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {

        parcel.writeParcelable(mCourse,0);
        parcel.writeString(mTitle);
        parcel.writeString(mText);

    }
}
