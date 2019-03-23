package com.catnip.bikecident.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IncidentDetail {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("occurred_at")
    @Expose
    private Integer occurredAt;
    @SerializedName("updated_at")
    @Expose
    private Integer updatedAt;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("source")
    @Expose
    private Source source;
    @SerializedName("media")
    @Expose
    private Media media;
    @SerializedName("location_type")
    @Expose
    private Object locationType;
    @SerializedName("location_description")
    @Expose
    private Object locationDescription;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("type_properties")
    @Expose
    private Object typeProperties;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getOccurredAt() {
        return occurredAt;
    }

    public void setOccurredAt(Integer occurredAt) {
        this.occurredAt = occurredAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public Object getLocationType() {
        return locationType;
    }

    public void setLocationType(Object locationType) {
        this.locationType = locationType;
    }

    public Object getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(Object locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getTypeProperties() {
        return typeProperties;
    }

    public void setTypeProperties(Object typeProperties) {
        this.typeProperties = typeProperties;
    }

}