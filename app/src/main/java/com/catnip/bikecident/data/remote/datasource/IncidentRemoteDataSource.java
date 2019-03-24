package com.catnip.bikecident.data.remote.datasource;

import com.catnip.bikecident.data.IncidentDataSource;
import com.catnip.bikecident.data.remote.network.NetworkClient;
import com.catnip.bikecident.data.remote.network.Routes;
import com.catnip.bikecident.model.accident.Incident;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IncidentRemoteDataSource implements IncidentDataSource {

    private Routes routes = NetworkClient.getClient().create(Routes.class);

    public void getListIncidents(final GetIncidentsCallback callback) {

        Call<Incident> call = routes.getAllIncidents();
        call.enqueue(new Callback<Incident>() {
            @Override
            public void onResponse(Call<Incident> call, Response<Incident> response) {
                callback.onIncidentLoaded(response.body());
            }

            @Override
            public void onFailure(Call<Incident> call, Throwable t) {
                callback.onDataNotAvailable(t.toString());
            }
        });
    }
}
