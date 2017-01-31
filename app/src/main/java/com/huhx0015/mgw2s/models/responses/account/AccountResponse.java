package com.huhx0015.mgw2s.models.responses.account;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountResponse {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("world")
    @Expose
    private Integer world;
    @SerializedName("commander")
    @Expose
    private Boolean commander;
    @SerializedName("guilds")
    @Expose
    private List<String> guilds = null;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("access")
    @Expose
    private String access;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWorld() {
        return world;
    }

    public void setWorld(Integer world) {
        this.world = world;
    }

    public Boolean getCommander() {
        return commander;
    }

    public void setCommander(Boolean commander) {
        this.commander = commander;
    }

    public List<String> getGuilds() {
        return guilds;
    }

    public void setGuilds(List<String> guilds) {
        this.guilds = guilds;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

}
