
package com.huhx0015.mgw2s.models.responses.characters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CharacterCoreResponse {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("race")
    @Expose
    private String race;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("profession")
    @Expose
    private String profession;
    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("guild")
    @Expose
    private String guild;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("deaths")
    @Expose
    private Integer deaths;
    @SerializedName("title")
    @Expose
    private Integer title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getGuild() {
        return guild;
    }

    public void setGuild(String guild) {
        this.guild = guild;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

}
