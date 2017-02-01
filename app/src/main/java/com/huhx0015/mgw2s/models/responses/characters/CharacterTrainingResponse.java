
package com.huhx0015.mgw2s.models.responses.characters;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CharacterTrainingResponse {

    @SerializedName("training")
    @Expose
    private List<Training> training = null;

    public List<Training> getTraining() {
        return training;
    }

    public void setTraining(List<Training> training) {
        this.training = training;
    }

}
