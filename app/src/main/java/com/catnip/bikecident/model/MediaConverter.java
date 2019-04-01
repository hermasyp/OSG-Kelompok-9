package com.catnip.bikecident.model;

import android.arch.persistence.room.TypeConverter;

import com.catnip.bikecident.model.accident.Media;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;

public class MediaConverter {
    private static Gson gson = new Gson();

//    @TypeConverter
//    public static Media stringToMedia(String data) {
//        Type media = new TypeToken<Media>() {}.getType();
//        return gson.fromJson(data, media);
//    }
//
//    @TypeConverter
//    public static String mediaToString(Media media) {
//        return gson.toJson(media);
//    }

//    @TypeConverter
//    public static Media fromString(String imageUrl, String imageUrlThumb) {
//        return (imageUrl == null && imageUrlThumb == null) ? null : new Media(imageUrl, imageUrlThumb);
//    }
//
//    @TypeConverter
//    public static String mediaToString(Media media) {
//        return media == null ? null : media.imageUrl();
//    }
}
