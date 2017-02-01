
package com.huhx0015.gw2at.models.responses.characters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes {

    @SerializedName("Power")
    @Expose
    private Integer power;
    @SerializedName("Precision")
    @Expose
    private Integer precision;
    @SerializedName("CritDamage")
    @Expose
    private Integer critDamage;

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Integer getCritDamage() {
        return critDamage;
    }

    public void setCritDamage(Integer critDamage) {
        this.critDamage = critDamage;
    }

}
