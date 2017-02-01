
package com.huhx0015.mgw2s.models.responses.characters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Training {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("spent")
    @Expose
    private Integer spent;
    @SerializedName("done")
    @Expose
    private Boolean done;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpent() {
        return spent;
    }

    public void setSpent(Integer spent) {
        this.spent = spent;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

}
