
package com.huhx0015.gw2at.model.responses.characters;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EquipmentPvp {

    @SerializedName("amulet")
    @Expose
    private Integer amulet;
    @SerializedName("rune")
    @Expose
    private Integer rune;
    @SerializedName("sigils")
    @Expose
    private List<Integer> sigils = null;

    public Integer getAmulet() {
        return amulet;
    }

    public void setAmulet(Integer amulet) {
        this.amulet = amulet;
    }

    public Integer getRune() {
        return rune;
    }

    public void setRune(Integer rune) {
        this.rune = rune;
    }

    public List<Integer> getSigils() {
        return sigils;
    }

    public void setSigils(List<Integer> sigils) {
        this.sigils = sigils;
    }

}
