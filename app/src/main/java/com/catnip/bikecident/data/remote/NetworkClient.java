package com.catnip.bikecident.data.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Written with love by Muhammad Hermas Yuda Pamungkas
 * Github : https://github.com/hermasyp
 **/
public class NetworkClient {
    private static Retrofit retrofit = null;
    public static Retrofit getClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://bikewise.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
