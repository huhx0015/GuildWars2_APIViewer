
package com.huhx0015.gw2at.model.responses.achievements;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bit {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private Integer id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
