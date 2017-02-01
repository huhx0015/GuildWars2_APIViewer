
package com.huhx0015.gw2at.models.responses.account;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountBankResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("upgrades")
    @Expose
    private List<Integer> upgrades = null;
    @SerializedName("infusions")
    @Expose
    private List<Integer> infusions = null;
    @SerializedName("skin")
    @Expose
    private Integer skin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Integer> getUpgrades() {
        return upgrades;
    }

    public void setUpgrades(List<Integer> upgrades) {
        this.upgrades = upgrades;
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

}
