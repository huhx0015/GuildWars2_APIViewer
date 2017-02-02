package com.huhx0015.gw2at.models.responses;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuaggansResponse implements Parcelable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;

    /** CONSTRUCTOR METHODS ____________________________________________________________________ **/

    public QuaggansResponse(String id, String url) {
        this.id = id;
        this.url = url;
    }

    /** GET / SET METHODS ______________________________________________________________________ **/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /** PARCELABLE METHODS _____________________________________________________________________ **/

    protected QuaggansResponse(Parcel in) {
        id = in.readString();
        url = in.readString();
    }

    public static final Creator<QuaggansResponse> CREATOR = new Creator<QuaggansResponse>() {
        @Override
        public QuaggansResponse createFromParcel(Parcel in) {
            return new QuaggansResponse(in);
        }

        @Override
        public QuaggansResponse[] newArray(int size) {
            return new QuaggansResponse[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(url);
    }
}