package com.adrianbucayan.app.collectiontest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author Adrian Bucayan on 12/21/16.
 */

public class Included implements Serializable {

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("attributes")
    @Expose
    private IncludedAttributes attributes;

    /*@SerializedName("links")
    @Expose
    private IncludedLinks links;

    @SerializedName("relationships")
    @Expose
    private IncludedRelationships relationships;*/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IncludedAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(IncludedAttributes attributes) {
        this.attributes = attributes;
    }

   /* public IncludedLinks getLinks() {
        return links;
    }

    public void setLinks(IncludedLinks links) {
        this.links = links;
    }

    public IncludedRelationships getRelationships() {
        return relationships;
    }

    public void setRelationships(IncludedRelationships relationships) {
        this.relationships = relationships;
    }*/

}
