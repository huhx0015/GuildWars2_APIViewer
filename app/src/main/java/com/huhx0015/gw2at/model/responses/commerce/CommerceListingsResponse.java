
package com.huhx0015.gw2at.model.responses.commerce;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommerceListingsResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("buys")
    @Expose
    private List<BuySell> buys = null;
    @SerializedName("sells")
    @Expose
    private List<BuySell> sells = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<BuySell> getBuys() {
        return buys;
    }

    public void setBuys(List<BuySell> buys) {
        this.buys = buys;
    }

    public List<BuySell> getSells() {
        return sells;
    }

    public void setSells(List<BuySell> sells) {
        this.sells = sells;
    }

}
