
package com.huhx0015.mgw2s.models.responses.recipes;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecipeResponse {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("output_item_id")
    @Expose
    private Integer outputItemId;
    @SerializedName("output_item_count")
    @Expose
    private Integer outputItemCount;
    @SerializedName("min_rating")
    @Expose
    private Integer minRating;
    @SerializedName("time_to_craft_ms")
    @Expose
    private Integer timeToCraftMs;
    @SerializedName("disciplines")
    @Expose
    private List<String> disciplines = null;
    @SerializedName("flags")
    @Expose
    private List<String> flags = null;
    @SerializedName("ingredients")
    @Expose
    private List<Ingredient> ingredients = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("chat_link")
    @Expose
    private String chatLink;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getOutputItemId() {
        return outputItemId;
    }

    public void setOutputItemId(Integer outputItemId) {
        this.outputItemId = outputItemId;
    }

    public Integer getOutputItemCount() {
        return outputItemCount;
    }

    public void setOutputItemCount(Integer outputItemCount) {
        this.outputItemCount = outputItemCount;
    }

    public Integer getMinRating() {
        return minRating;
    }

    public void setMinRating(Integer minRating) {
        this.minRating = minRating;
    }

    public Integer getTimeToCraftMs() {
        return timeToCraftMs;
    }

    public void setTimeToCraftMs(Integer timeToCraftMs) {
        this.timeToCraftMs = timeToCraftMs;
    }

    public List<String> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<String> disciplines) {
        this.disciplines = disciplines;
    }

    public List<String> getFlags() {
        return flags;
    }

    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChatLink() {
        return chatLink;
    }

    public void setChatLink(String chatLink) {
        this.chatLink = chatLink;
    }

}
