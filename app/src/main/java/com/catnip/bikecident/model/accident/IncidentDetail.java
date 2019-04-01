package com.catnip.bikecident.model.accident;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.catnip.bikecident.R;
import com.google.gson.annotations.SerializedName;
import com.squareup.picasso.Picasso;

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
    public String occurredAt;

    @ColumnInfo(name = "updated_at")
    @SerializedName("updated_at")
    public Integer updatedAt;

    @ColumnInfo(name = "url")
    @SerializedName("url")
    public String url;

//    @ColumnInfo(name = "source")
//    @SerializedName("source")
//    @Embedded
//    public Source source;

//    @ColumnInfo(name = "media")
    @SerializedName("media")
    @Embedded
    public Media media;

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

    public int iconResourceId;

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

    public String getOccurredAt() {
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

    public Media getMedia() {
        return media;
    }

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

    public IncidentDetail(int iconResourceId) {
        this.iconResourceId = iconResourceId;
    }

    @BindingAdapter({"iconType"})
    public static void loadIcon(ImageView view, String type) {
        if (type.equalsIgnoreCase("crash")) {
            Picasso.get()
                    .load(R.drawable.icon_accident)
                    .into(view);
        }
        else if (type.equalsIgnoreCase("hazard")) {
            Picasso.get()
                    .load(R.drawable.icon_hazard)
                    .into(view);
        }
        else if (type.equalsIgnoreCase("theft")) {
            Picasso.get()
                    .load(R.drawable.icon_thief)
                    .into(view);
        }
        else if (type.equalsIgnoreCase("infrastructure_issue")) {
            Picasso.get()
                    .load(R.drawable.icon_infra_issue)
                    .into(view);
        }
        else if (type.equalsIgnoreCase("chop_shop")) {
            Picasso.get()
                    .load(R.drawable.icon_chop_shop)
                    .into(view);
        } else {
            Picasso.get()
                    .load(R.drawable.icon_hazard)
                    .into(view);
        }
    }
}