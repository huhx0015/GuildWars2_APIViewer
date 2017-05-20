
package com.huhx0015.gw2at.model.responses.commerce;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BuySell {

    @SerializedName("listings")
    @Expose
    private Integer listings;
    @SerializedName("unit_price")
    @Expose
    private Integer unitPrice;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;

    public Integer getListings() {
        return listings;
    }

    public void setListings(Integer listings) {
        this.listings = listings;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
