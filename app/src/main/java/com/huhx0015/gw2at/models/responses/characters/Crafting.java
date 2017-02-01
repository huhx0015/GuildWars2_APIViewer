
package com.huhx0015.gw2at.models.responses.characters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Crafting {

    @SerializedName("discipline")
    @Expose
    private String discipline;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("active")
    @Expose
    private Boolean active;

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}
