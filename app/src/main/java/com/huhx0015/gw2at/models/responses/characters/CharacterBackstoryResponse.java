
package com.huhx0015.gw2at.models.responses.characters;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CharacterBackstoryResponse {

    @SerializedName("backstory")
    @Expose
    private List<String> backstory = null;

    public List<String> getBackstory() {
        return backstory;
    }

    public void setBackstory(List<String> backstory) {
        this.backstory = backstory;
    }

}
