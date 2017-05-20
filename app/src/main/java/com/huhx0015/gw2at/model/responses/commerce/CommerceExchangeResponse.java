
package com.huhx0015.gw2at.model.responses.commerce;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommerceExchangeResponse {

    @SerializedName("coins_per_gem")
    @Expose
    private Integer coinsPerGem;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;

    public Integer getCoinsPerGem() {
        return coinsPerGem;
    }

    public void setCoinsPerGem(Integer coinsPerGem) {
        this.coinsPerGem = coinsPerGem;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
