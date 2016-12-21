package com.adrianbucayan.app.collectiontest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author Adrian Bucayan on 12/21/16.
 */

public class Services implements Serializable {

    @SerializedName("links")
    @Expose
    private LinksRelated linksRelated;

    public LinksRelated getLinksRelated() {
        return linksRelated;
    }

    public void setLinksRelated(LinksRelated linksRelated) {
        this.linksRelated = linksRelated;
    }

}
