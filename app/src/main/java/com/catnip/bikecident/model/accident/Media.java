package com.catnip.bikecident.model.accident;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.squareup.picasso.Picasso;

//@Entity(tableName = "incident")
public class Media {

    //@PrimaryKey(autoGenerate = true)
    public int mId;

    //@ColumnInfo(name = "image_url")
    @SerializedName("image_url")
    public Object imageUrl;

    //@ColumnInfo(name = "image_url_thumb")
    @SerializedName("image_url_thumb")
    public Object imageUrlThumb;

    public int getmId() {
        return mId;
    }

    public Object getImageUrl() {
        return imageUrl;
    }

    //@BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Picasso.get()
                .load(imageUrl)
                .into(view);

    }

    public Object getImageUrlThumb() {
        return imageUrlThumb;
    }


    public Media(int mId, Object imageUrl, Object imageUrlThumb) {
        this.mId = mId;
        this.imageUrl = imageUrl;
        this.imageUrlThumb = imageUrlThumb;
    }
}