
package com.huhx0015.gw2at.models.responses.account;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountMasteriesResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("level")
    @Expose
    private Integer level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

}
