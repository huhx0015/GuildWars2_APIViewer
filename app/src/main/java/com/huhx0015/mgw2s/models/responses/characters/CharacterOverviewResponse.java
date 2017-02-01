
package com.huhx0015.mgw2s.models.responses.characters;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CharacterOverviewResponse {

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
    @SerializedName("crafting")
    @Expose
    private List<Crafting> crafting = null;
    @SerializedName("title")
    @Expose
    private Integer title;
    @SerializedName("backstory")
    @Expose
    private List<String> backstory = null;
    @SerializedName("wvw_abilities")
    @Expose
    private List<WvwAbility> wvwAbilities = null;
    @SerializedName("specializations")
    @Expose
    private Specializations specializations;
    @SerializedName("skills")
    @Expose
    private Skills skills;
    @SerializedName("equipment")
    @Expose
    private List<Equipment> equipment = null;
    @SerializedName("recipes")
    @Expose
    private List<Integer> recipes = null;
    @SerializedName("equipment_pvp")
    @Expose
    private EquipmentPvp equipmentPvp;
    @SerializedName("training")
    @Expose
    private List<Training> training = null;
    @SerializedName("bags")
    @Expose
    private List<Bag> bags = null;

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

    public List<Crafting> getCrafting() {
        return crafting;
    }

    public void setCrafting(List<Crafting> crafting) {
        this.crafting = crafting;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public List<String> getBackstory() {
        return backstory;
    }

    public void setBackstory(List<String> backstory) {
        this.backstory = backstory;
    }

    public List<WvwAbility> getWvwAbilities() {
        return wvwAbilities;
    }

    public void setWvwAbilities(List<WvwAbility> wvwAbilities) {
        this.wvwAbilities = wvwAbilities;
    }

    public Specializations getSpecializations() {
        return specializations;
    }

    public void setSpecializations(Specializations specializations) {
        this.specializations = specializations;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    public List<Integer> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Integer> recipes) {
        this.recipes = recipes;
    }

    public EquipmentPvp getEquipmentPvp() {
        return equipmentPvp;
    }

    public void setEquipmentPvp(EquipmentPvp equipmentPvp) {
        this.equipmentPvp = equipmentPvp;
    }

    public List<Training> getTraining() {
        return training;
    }

    public void setTraining(List<Training> training) {
        this.training = training;
    }

    public List<Bag> getBags() {
        return bags;
    }

    public void setBags(List<Bag> bags) {
        this.bags = bags;
    }

}
