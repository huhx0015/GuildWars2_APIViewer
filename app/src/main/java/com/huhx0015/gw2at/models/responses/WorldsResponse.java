
package com.huhx0015.gw2at.models.responses;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WorldsResponse implements Parcelable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("population")
    @Expose
    private String population;

    /** GET / SET METHODS ______________________________________________________________________ **/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    /** PARCELABLE METHODS _____________________________________________________________________ **/

    protected WorldsResponse(Parcel in) {
        id = in.readInt();
        name = in.readString();
        population = in.readString();
    }

    public static final Creator<WorldsResponse> CREATOR = new Creator<WorldsResponse>() {
        @Override
        public WorldsResponse createFromParcel(Parcel in) {
            return new WorldsResponse(in);
        }

        @Override
        public WorldsResponse[] newArray(int size) {
            return new WorldsResponse[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(population);
    }
}
