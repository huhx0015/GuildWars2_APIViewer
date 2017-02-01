
package com.huhx0015.gw2at.models.responses.achievements;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AchievementsResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("requirement")
    @Expose
    private String requirement;
    @SerializedName("locked_text")
    @Expose
    private String lockedText;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("flags")
    @Expose
    private List<String> flags = null;
    @SerializedName("tiers")
    @Expose
    private List<Tier> tiers = null;
    @SerializedName("rewards")
    @Expose
    private List<Reward> rewards = null;
    @SerializedName("bits")
    @Expose
    private List<Bit> bits = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getLockedText() {
        return lockedText;
    }

    public void setLockedText(String lockedText) {
        this.lockedText = lockedText;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getFlags() {
        return flags;
    }

    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    public List<Tier> getTiers() {
        return tiers;
    }

    public void setTiers(List<Tier> tiers) {
        this.tiers = tiers;
    }

    public List<Reward> getRewards() {
        return rewards;
    }

    public void setRewards(List<Reward> rewards) {
        this.rewards = rewards;
    }

    public List<Bit> getBits() {
        return bits;
    }

    public void setBits(List<Bit> bits) {
        this.bits = bits;
    }

}
