
package com.huhx0015.gw2at.models.responses.colors;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ColorResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("base_rgb")
    @Expose
    private List<Integer> baseRgb = null;
    @SerializedName("cloth")
    @Expose
    private Cloth cloth;
    @SerializedName("leather")
    @Expose
    private Leather leather;
    @SerializedName("metal")
    @Expose
    private Metal metal;
    @SerializedName("item")
    @Expose
    private Integer item;
    @SerializedName("categories")
    @Expose
    private List<String> categories = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getBaseRgb() {
        return baseRgb;
    }

    public void setBaseRgb(List<Integer> baseRgb) {
        this.baseRgb = baseRgb;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    public Leather getLeather() {
        return leather;
    }

    public void setLeather(Leather leather) {
        this.leather = leather;
    }

    public Metal getMetal() {
        return metal;
    }

    public void setMetal(Metal metal) {
        this.metal = metal;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

}
