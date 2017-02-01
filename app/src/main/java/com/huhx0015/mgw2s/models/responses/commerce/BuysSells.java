
package com.huhx0015.mgw2s.models.responses.commerce;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BuysSells {

    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("unit_price")
    @Expose
    private Integer unitPrice;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

}
