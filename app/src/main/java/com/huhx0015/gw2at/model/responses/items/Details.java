
package com.huhx0015.gw2at.model.responses.items;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Details {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("damage_type")
    @Expose
    private String damageType;
    @SerializedName("min_power")
    @Expose
    private Integer minPower;
    @SerializedName("max_power")
    @Expose
    private Integer maxPower;
    @SerializedName("defense")
    @Expose
    private Integer defense;
    @SerializedName("infusion_slots")
    @Expose
    private List<Object> infusionSlots = null;
    @SerializedName("infix_upgrade")
    @Expose
    private InfixUpgrade infixUpgrade;
    @SerializedName("suffix_item_id")
    @Expose
    private Integer suffixItemId;
    @SerializedName("secondary_suffix_item_id")
    @Expose
    private String secondarySuffixItemId;
    @SerializedName("duration_ms")
    @Expose
    private Integer durationMs;
    @SerializedName("apply_count")
    @Expose
    private Integer applyCount;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("description")
    @Expose
    private String description;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public Integer getMinPower() {
        return minPower;
    }

    public void setMinPower(Integer minPower) {
        this.minPower = minPower;
    }

    public Integer getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(Integer maxPower) {
        this.maxPower = maxPower;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public List<Object> getInfusionSlots() {
        return infusionSlots;
    }

    public void setInfusionSlots(List<Object> infusionSlots) {
        this.infusionSlots = infusionSlots;
    }

    public InfixUpgrade getInfixUpgrade() {
        return infixUpgrade;
    }

    public void setInfixUpgrade(InfixUpgrade infixUpgrade) {
        this.infixUpgrade = infixUpgrade;
    }

    public Integer getSuffixItemId() {
        return suffixItemId;
    }

    public void setSuffixItemId(Integer suffixItemId) {
        this.suffixItemId = suffixItemId;
    }

    public String getSecondarySuffixItemId() {
        return secondarySuffixItemId;
    }

    public void setSecondarySuffixItemId(String secondarySuffixItemId) {
        this.secondarySuffixItemId = secondarySuffixItemId;
    }

    public Integer getDurationMs() {
        return durationMs;
    }

    public void setDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
    }

    public Integer getApplyCount() {
        return applyCount;
    }

    public void setApplyCount(Integer applyCount) {
        this.applyCount = applyCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
