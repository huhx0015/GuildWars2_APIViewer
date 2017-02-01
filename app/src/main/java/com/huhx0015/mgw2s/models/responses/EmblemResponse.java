
package com.huhx0015.mgw2s.models.responses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmblemResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("layers")
    @Expose
    private List<String> layers = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getLayers() {
        return layers;
    }

    public void setLayers(List<String> layers) {
        this.layers = layers;
    }

}
