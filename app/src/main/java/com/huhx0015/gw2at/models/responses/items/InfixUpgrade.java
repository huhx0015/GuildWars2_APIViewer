
package com.huhx0015.gw2at.models.responses.items;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InfixUpgrade {

    @SerializedName("attributes")
    @Expose
    private List<Attribute> attributes = null;

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

}
