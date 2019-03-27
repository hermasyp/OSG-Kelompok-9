package com.catnip.bikecident.navigator;

import com.catnip.bikecident.model.accident.IncidentDetail;

import java.util.List;

public interface IncidentNavigator {

    void loadListIncident(List<IncidentDetail> listIncident);
    void errorLoadListIncident(String message);
}
