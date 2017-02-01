
package com.huhx0015.gw2at.models.responses.achievements;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AchievementsDailyResponse {

    @SerializedName("pve")
    @Expose
    private List<Type> pve = null;
    @SerializedName("pvp")
    @Expose
    private List<Type> pvp = null;
    @SerializedName("wvw")
    @Expose
    private List<Type> wvw = null;
    @SerializedName("special")
    @Expose
    private List<Type> special = null;

    public List<Type> getPve() {
        return pve;
    }

    public void setPve(List<Type> pve) {
        this.pve = pve;
    }

    public List<Type> getPvp() {
        return pvp;
    }

    public void setPvp(List<Type> pvp) {
        this.pvp = pvp;
    }

    public List<Type> getWvw() {
        return wvw;
    }

    public void setWvw(List<Type> wvw) {
        this.wvw = wvw;
    }

    public List<Type> getSpecial() {
        return special;
    }

    public void setSpecial(List<Type> special) {
        this.special = special;
    }

}
