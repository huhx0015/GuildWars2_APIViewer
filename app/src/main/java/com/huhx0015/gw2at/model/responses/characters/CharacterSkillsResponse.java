
package com.huhx0015.gw2at.model.responses.characters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CharacterSkillsResponse {

    @SerializedName("skills")
    @Expose
    private Skills skills;

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

}
