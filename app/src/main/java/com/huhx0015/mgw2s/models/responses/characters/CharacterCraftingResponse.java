
package com.huhx0015.mgw2s.models.responses.characters;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CharacterCraftingResponse {

    @SerializedName("crafting")
    @Expose
    private List<Crafting> crafting = null;

    public List<Crafting> getCrafting() {
        return crafting;
    }

    public void setCrafting(List<Crafting> crafting) {
        this.crafting = crafting;
    }

}
