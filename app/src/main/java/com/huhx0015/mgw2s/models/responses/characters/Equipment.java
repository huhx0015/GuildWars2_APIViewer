
package com.huhx0015.mgw2s.models.responses.characters;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Equipment {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("slot")
    @Expose
    private String slot;
    @SerializedName("upgrades")
    @Expose
    private List<Integer> upgrades = null;
    @SerializedName("binding")
    @Expose
    private String binding;
    @SerializedName("bound_to")
    @Expose
    private String boundTo;
    @SerializedName("infusions")
    @Expose
    private List<Integer> infusions = null;
    @SerializedName("skin")
    @Expose
    private Integer skin;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("charges")
    @Expose
    private Integer charges;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public List<Integer> getUpgrades() {
        return upgrades;
    }

    public void setUpgrades(List<Integer> upgrades) {
        this.upgrades = upgrades;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getBoundTo() {
        return boundTo;
    }

    public void setBoundTo(String boundTo) {
        this.boundTo = boundTo;
    }

    public List<Integer> getInfusions() {
        return infusions;
    }

    public void setInfusions(List<Integer> infusions) {
        this.infusions = infusions;
    }

    public Integer getSkin() {
        return skin;
    }

    public void setSkin(Integer skin) {
        this.skin = skin;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Integer getCharges() {
        return charges;
    }

    public void setCharges(Integer charges) {
        this.charges = charges;
    }

}
