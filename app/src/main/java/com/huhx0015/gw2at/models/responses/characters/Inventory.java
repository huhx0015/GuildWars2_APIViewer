
package com.huhx0015.gw2at.models.responses.characters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Inventory {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("binding")
    @Expose
    private String binding;
    @SerializedName("bound_to")
    @Expose
    private String boundTo;

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

    public String getBoundTo() {
        return boundTo;
    }

    public void setBoundTo(String boundTo) {
        this.boundTo = boundTo;
    }

}
