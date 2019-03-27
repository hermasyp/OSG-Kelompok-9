package com.catnip.bikecident.model.accident;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;
import com.catnip.bikecident.model.Converter;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "incident")
public class IncidentDetail {

    @PrimaryKey
    @SerializedName("id")
    public Integer id;

    @ColumnInfo(name = "title")
    @SerializedName("title")
    public String title;

    @ColumnInfo(name = "description")
    @SerializedName("description")
    public String description;

    @ColumnInfo(name = "address")
    @SerializedName("address")
    public String address;

    @ColumnInfo(name = "occurred_at")
    @SerializedName("occurred_at")
    public Integer occurredAt;

    @ColumnInfo(name = "updated_at")
    @SerializedName("updated_at")
    public Integer updatedAt;

    @ColumnInfo(name = "url")
    @SerializedName("url")
    public String url;

//    @ColumnInfo(name = "source")
//    @SerializedName("source")
//    public Source source;

//    @TypeConverters(Converter.class)
//    @ColumnInfo(name = "media")
//    @SerializedName("media")
//    public Media media;

    @ColumnInfo(name = "location_type")
    @SerializedName("location_type")
    public String locationType;

    @ColumnInfo(name = "location_description")
    @SerializedName("location_description")
    public String locationDescription;

    @ColumnInfo(name = "type")
    @SerializedName("type")
    public String type;

    @ColumnInfo(name = "type_properties")
    @SerializedName("type_properties")
    public String typeProperties;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public Integer getOccurredAt() {
        return occurredAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public String getUrl() {
        return url;
    }

//    public Source getSource() {
//        return source;
//    }
//
//    public Media getMedia() {
//        return media;
//    }

    public String getLocationType() {
        return locationType;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public String getType() {
        return type;
    }

    public String getTypeProperties() {
        return typeProperties;
    }
}