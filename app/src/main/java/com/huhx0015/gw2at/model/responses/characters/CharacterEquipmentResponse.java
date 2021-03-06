
package com.huhx0015.gw2at.model.responses.characters;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CharacterEquipmentResponse {

    @SerializedName("equipment")
    @Expose
    private List<Equipment> equipment = null;

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

}
