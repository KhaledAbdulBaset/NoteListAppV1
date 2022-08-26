package com.example.notekeeper;

import android.content.pm.ModuleInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.RequiresApi;

import java.util.List;

public final class courseInfo implements Parcelable {
    private final String mCourseId;
    private final String mTitle;
    private final List<ModuleInfo> mModules;


    public courseInfo(String mCourseId, String mTitle, List<ModuleInfo> mModules) {
        this.mCourseId = mCourseId;
        this.mTitle = mTitle;
        this.mModules = mModules;
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    protected courseInfo(Parcel in) {
        mCourseId = in.readString();
        mTitle = in.readString();
        mModules = in.createTypedArrayList(ModuleInfo.CREATOR);
    }

    public static final Creator<courseInfo> CREATOR = new Creator<courseInfo>() {
        @RequiresApi(api = Build.VERSION_CODES.Q)
        @Override
        public courseInfo createFromParcel(Parcel in) {
            return new courseInfo(in);
        }

        @Override
        public courseInfo[] newArray(int size) {
            return new courseInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mCourseId);
        dest.writeString(mTitle);
        dest.writeTypedList(mModules);
    }
}
