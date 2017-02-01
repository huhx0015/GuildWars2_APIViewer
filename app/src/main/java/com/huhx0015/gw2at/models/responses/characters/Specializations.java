
package com.huhx0015.gw2at.models.responses.characters;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Specializations {

    @SerializedName("pve")
    @Expose
    private List<SkillType> pve = null;
    @SerializedName("pvp")
    @Expose
    private List<SkillType> pvp = null;
    @SerializedName("wvw")
    @Expose
    private List<SkillType> wvw = null;

    public List<SkillType> getPve() {
        return pve;
    }

    public void setPve(List<SkillType> pve) {
        this.pve = pve;
    }

    public List<SkillType> getPvp() {
        return pvp;
    }

    public void setPvp(List<SkillType> pvp) {
        this.pvp = pvp;
    }

    public List<SkillType> getWvw() {
        return wvw;
    }

    public void setWvw(List<SkillType> wvw) {
        this.wvw = wvw;
    }

}
