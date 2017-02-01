
package com.huhx0015.gw2at.models.responses.achievements;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tier {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("points")
    @Expose
    private Integer points;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

}
