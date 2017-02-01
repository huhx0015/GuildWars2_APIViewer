
package com.huhx0015.gw2at.models.responses.account;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountInventoryResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("binding")
    @Expose
    private String binding;

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

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

}
