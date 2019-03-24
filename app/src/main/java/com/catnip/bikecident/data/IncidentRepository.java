package com.catnip.bikecident.data;

import android.support.annotation.Nullable;

import com.catnip.bikecident.data.local.IncidentLocalDataSource;
import com.catnip.bikecident.data.remote.datasource.IncidentRemoteDataSource;
import com.catnip.bikecident.model.accident.Incident;

public class IncidentRepository implements IncidentDataSource {

    private IncidentRemoteDataSource incidentRemoteDataSource;
    private IncidentLocalDataSource incidentLocalDataSource;

    public IncidentRepository(IncidentRemoteDataSource incidentRemoteDataSource, IncidentLocalDataSource incidentLocalDataSource) {
        this.incidentRemoteDataSource = incidentRemoteDataSource;
        this.incidentLocalDataSource = incidentLocalDataSource;
    }

    @Override
    public void getListIncidents(final GetIncidentsCallback callback) {
        incidentLocalDataSource.getListIncidents(new GetIncidentsCallback() {
            @Override
            public void onIncidentLoaded(Incident data) {
                callback.onIncidentLoaded(data);
            }

            @Override
            public void onDataNotAvailable(String errorMessage) {
                getIncidentsfromRemoteDataSource(callback);
            }
        });
    }

    private void getIncidentsfromRemoteDataSource(@Nullable final GetIncidentsCallback callback) {

        incidentRemoteDataSource.getListIncidents(new GetIncidentsCallback() {
            @Override
            public void onIncidentLoaded(Incident data) {
                incidentLocalDataSource.saveDataIncident(data.getIncidents());
                callback.onIncidentLoaded(data);
            }

            @Override
            public void onDataNotAvailable(String errorMessage) {
                callback.onDataNotAvailable(errorMessage);
            }
        });
    }
}
