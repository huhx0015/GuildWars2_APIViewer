package com.huhx0015.gw2at.model.responses.achievements;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by Michael Yoon Huh on 1/31/2017.
 */

public class Type {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("level")
    @Expose
    private Level level;
    @SerializedName("required_access")
    @Expose
    private List<String> requiredAccess = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public List<String> getRequiredAccess() {
        return requiredAccess;
    }

    public void setRequiredAccess(List<String> requiredAccess) {
        this.requiredAccess = requiredAccess;
    }
}
