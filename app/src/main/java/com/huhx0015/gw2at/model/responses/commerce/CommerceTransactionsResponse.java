
package com.huhx0015.gw2at.model.responses.commerce;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommerceTransactionsResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("item_id")
    @Expose
    private Integer itemId;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("purchased")
    @Expose
    private String purchased;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getPurchased() {
        return purchased;
    }

    public void setPurchased(String purchased) {
        this.purchased = purchased;
    }

}
