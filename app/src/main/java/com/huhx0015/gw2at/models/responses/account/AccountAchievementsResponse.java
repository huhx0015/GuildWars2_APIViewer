
package com.huhx0015.gw2at.models.responses.account;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountAchievementsResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("current")
    @Expose
    private Integer current;
    @SerializedName("max")
    @Expose
    private Integer max;
    @SerializedName("done")
    @Expose
    private Boolean done;
    @SerializedName("bits")
    @Expose
    private List<Integer> bits = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public List<Integer> getBits() {
        return bits;
    }

    public void setBits(List<Integer> bits) {
        this.bits = bits;
    }

}
