package com.catnip.bikecident.model.accident;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Incident {

    @SerializedName("incidents")
    List<IncidentDetail> incidents;

    public Incident(List<IncidentDetail> incidents) {
        this.incidents = incidents;
    }

    public List<IncidentDetail> getIncidents() {
        return incidents;
    }
}