package com.catnip.bikecident.data;

import com.catnip.bikecident.model.Incident;

public interface IncidentDataSource {

    interface GetIncidentsCallback {
        void onIncidentLoaded(Incident data);
        void onDataNotAvailable(String errorMessage);
    }
}
