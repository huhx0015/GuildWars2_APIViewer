
package com.huhx0015.gw2at.models.responses.characters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CharacterSpecializationsResponse {

    @SerializedName("specializations")
    @Expose
    private Specializations specializations;

    public Specializations getSpecializations() {
        return specializations;
    }

    public void setSpecializations(Specializations specializations) {
        this.specializations = specializations;
    }

}
