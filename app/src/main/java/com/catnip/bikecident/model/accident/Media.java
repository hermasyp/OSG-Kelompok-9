package com.catnip.bikecident.model.accident;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.databinding.BindingAdapter;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.squareup.picasso.Picasso;

//@Entity(tableName = "media")
public class Media {
//
//    @PrimaryKey(autoGenerate = true)
//    public int mId;

    @ColumnInfo(name = "image_url")
    @SerializedName("image_url")
    public String imageUrl;

    @ColumnInfo(name = "image_url_thumb")
    @SerializedName("image_url_thumb")
    public String imageUrlThumb;

    public Media(String imageUrl, String imageUrlThumb) {
        this.imageUrl = imageUrl;
        this.imageUrlThumb = imageUrlThumb;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getImageUrlThumb() {
        return imageUrlThumb;
    }

    @BindingAdapter({"imageIncident"})
    public static void loadImage(ImageView view, String imageUrl) {
        if (imageUrl!=null) {
            Picasso.get()
                    .load(imageUrl)
                    .fit()
                    .into(view);
        } else {
            view.setVisibility(View.GONE);
        }
        Log.e("image", "Image is : " + imageUrl);

    }
}