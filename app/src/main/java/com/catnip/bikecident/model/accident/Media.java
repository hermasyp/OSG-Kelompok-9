package com.catnip.bikecident.model.accident;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Media {

    @SerializedName("image_url")
    @Expose
    private Object imageUrl;
    @SerializedName("image_url_thumb")
    @Expose
    private Object imageUrlThumb;

    public Object getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Object getImageUrlThumb() {
        return imageUrlThumb;
    }

    public void setImageUrlThumb(Object imageUrlThumb) {
        this.imageUrlThumb = imageUrlThumb;
    }

}