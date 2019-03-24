package com.catnip.bikecident.data.local;

import android.content.Context;

import com.catnip.bikecident.data.IncidentDataSource;
import com.catnip.bikecident.model.accident.Incident;
import com.catnip.bikecident.model.accident.IncidentDetail;

import java.util.List;

public class IncidentLocalDataSource implements IncidentDataSource {
    private Context context;
    private IncidentDao incidentDao;

    public IncidentLocalDataSource(Context context) {
        this.context = context;
        incidentDao = IncidentDataBase.getInstance(context).incidentDao();
    }

    @Override
    public void getListIncidents(final GetIncidentsCallback callback) {
        Runnable runnable =new Runnable() {
            @Override
            public void run() {
                final List<IncidentDetail> incident = incidentDao.getIncidents();
                if (incident.isEmpty()) {
                    callback.onDataNotAvailable("Data di Database DQLite kosong");
                } else {
                    Incident incidents = new Incident(incident);
                    callback.onIncidentLoaded(incidents);
                }
            }
        };
        new Thread(runnable).start();
    }

    public void saveDataIncident(final List<IncidentDetail> incidentDetail) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                incidentDao.insertIncident(incidentDetail);
            }
        };
        new Thread(runnable).start();
    }
}
