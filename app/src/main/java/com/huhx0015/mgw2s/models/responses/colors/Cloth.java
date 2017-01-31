
package com.huhx0015.mgw2s.models.responses.colors;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cloth {

    @SerializedName("brightness")
    @Expose
    private Integer brightness;
    @SerializedName("contrast")
    @Expose
    private Double contrast;
    @SerializedName("hue")
    @Expose
    private Integer hue;
    @SerializedName("saturation")
    @Expose
    private Double saturation;
    @SerializedName("lightness")
    @Expose
    private Double lightness;
    @SerializedName("rgb")
    @Expose
    private List<Integer> rgb = null;

    public Integer getBrightness() {
        return brightness;
    }

    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }

    public Double getContrast() {
        return contrast;
    }

    public void setContrast(Double contrast) {
        this.contrast = contrast;
    }

    public Integer getHue() {
        return hue;
    }

    public void setHue(Integer hue) {
        this.hue = hue;
    }

    public Double getSaturation() {
        return saturation;
    }

    public void setSaturation(Double saturation) {
        this.saturation = saturation;
    }

    public Double getLightness() {
        return lightness;
    }

    public void setLightness(Double lightness) {
        this.lightness = lightness;
    }

    public List<Integer> getRgb() {
        return rgb;
    }

    public void setRgb(List<Integer> rgb) {
        this.rgb = rgb;
    }

}
