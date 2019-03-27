package com.catnip.bikecident.viewmodel;

import android.content.Context;
import android.util.Log;

import com.catnip.bikecident.data.IncidentDataSource;
import com.catnip.bikecident.data.IncidentRepository;
import com.catnip.bikecident.model.accident.Incident;
import com.catnip.bikecident.navigator.IncidentNavigator;

public class IncidentViewModel {

    private IncidentRepository incidentRepository;
    private Context context;
    private IncidentNavigator mNavigator;

    public IncidentViewModel(IncidentRepository incidentRepository, Context context) {
        this.incidentRepository = incidentRepository;
        this.context = context;
    }

    public void setNavigator(IncidentNavigator navigator) {
        mNavigator = navigator;
    }

    public void getListIncident() {
        incidentRepository.getListIncidents(new IncidentDataSource.GetIncidentsCallback() {
            @Override
            public void onIncidentLoaded(Incident data) {
                mNavigator.loadListIncident(data.getIncidents());
            }

            @Override
            public void onDataNotAvailable(String errorMessage) {
                mNavigator.errorLoadListIncident(errorMessage);
            }
        });
    }
}
