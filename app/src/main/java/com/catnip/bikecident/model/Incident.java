package com.catnip.bikecident.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Incident {

    @SerializedName("incidents")
    @Expose
    private List<IncidentDetail> incidentDetails = null;

    public List<IncidentDetail> getIncidentDetails() {
        return incidentDetails;
    }

    public void setIncidentDetails(List<IncidentDetail> incidentDetails) {
        this.incidentDetails = incidentDetails;
    }

}