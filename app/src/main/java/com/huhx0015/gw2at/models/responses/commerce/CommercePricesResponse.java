
package com.huhx0015.gw2at.models.responses.commerce;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommercePricesResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("whitelisted")
    @Expose
    private Boolean whitelisted;
    @SerializedName("buys")
    @Expose
    private BuysSells buys;
    @SerializedName("sells")
    @Expose
    private BuysSells sells;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getWhitelisted() {
        return whitelisted;
    }

    public void setWhitelisted(Boolean whitelisted) {
        this.whitelisted = whitelisted;
    }

    public BuysSells getBuys() {
        return buys;
    }

    public void setBuys(BuysSells buys) {
        this.buys = buys;
    }

    public BuysSells getSells() {
        return sells;
    }

    public void setSells(BuysSells sells) {
        this.sells = sells;
    }

}
