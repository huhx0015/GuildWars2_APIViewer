
package com.huhx0015.mgw2s.models.responses.recipes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ingredient {

    @SerializedName("item_id")
    @Expose
    private Integer itemId;
    @SerializedName("count")
    @Expose
    private Integer count;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
