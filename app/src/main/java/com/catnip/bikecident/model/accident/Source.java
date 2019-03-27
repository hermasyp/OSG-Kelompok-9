package com.catnip.bikecident.model.accident;

import android.arch.persistence.room.ColumnInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Source {

    @ColumnInfo(name = "name")
    @SerializedName("name")
    public String name;
    @ColumnInfo(name = "html_url")
    @SerializedName("html_url")
    public String htmlUrl;
    @ColumnInfo(name = "api_url")
    @SerializedName("api_url")
    public String apiUrl;

    public String getName() {
        return name;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getApiUrl() {
        return apiUrl;
    }
}
