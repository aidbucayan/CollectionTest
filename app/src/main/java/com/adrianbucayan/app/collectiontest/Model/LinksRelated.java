package com.adrianbucayan.app.collectiontest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author Adrian Bucayan on 12/21/16.
 */

public class LinksRelated implements Serializable {

    @SerializedName("related")
    @Expose
    private String related;

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }

}
