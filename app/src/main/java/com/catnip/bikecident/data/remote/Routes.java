package com.catnip.bikecident.data.remote;

import com.catnip.bikecident.model.Incident;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Written with love by Muhammad Hermas Yuda Pamungkas
 * Github : https://github.com/hermasyp
 **/
public interface Routes {

    @GET("api/v2/incidents")
    Call<Incident> getAllIncidents();
}
