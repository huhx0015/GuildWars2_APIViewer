
package com.huhx0015.gw2at.models.responses.achievements;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Level {

    @SerializedName("min")
    @Expose
    private Integer min;
    @SerializedName("max")
    @Expose
    private Integer max;

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

}
