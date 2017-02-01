
package com.huhx0015.gw2at.models.responses.characters;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SkillType {

    @SerializedName("heal")
    @Expose
    private Integer heal;
    @SerializedName("utilities")
    @Expose
    private List<Integer> utilities = null;
    @SerializedName("elite")
    @Expose
    private Integer elite;

    public Integer getHeal() {
        return heal;
    }

    public void setHeal(Integer heal) {
        this.heal = heal;
    }

    public List<Integer> getUtilities() {
        return utilities;
    }

    public void setUtilities(List<Integer> utilities) {
        this.utilities = utilities;
    }

    public Integer getElite() {
        return elite;
    }

    public void setElite(Integer elite) {
        this.elite = elite;
    }

}
