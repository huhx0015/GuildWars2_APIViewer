
package com.huhx0015.gw2at.model.responses.characters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Skills {

    @SerializedName("pve")
    @Expose
    private SkillType pve;
    @SerializedName("pvp")
    @Expose
    private SkillType pvp;
    @SerializedName("wvw")
    @Expose
    private SkillType wvw;

    public SkillType getPve() {
        return pve;
    }

    public void setPve(SkillType pve) {
        this.pve = pve;
    }

    public SkillType getPvp() {
        return pvp;
    }

    public void setPvp(SkillType pvp) {
        this.pvp = pvp;
    }

    public SkillType getWvw() {
        return wvw;
    }

    public void setWvw(SkillType wvw) {
        this.wvw = wvw;
    }

}
