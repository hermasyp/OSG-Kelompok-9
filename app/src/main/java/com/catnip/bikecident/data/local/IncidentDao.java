package com.catnip.bikecident.data.local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.catnip.bikecident.model.accident.IncidentDetail;

import java.util.List;

@Dao
public interface IncidentDao {
    @Query("SELECT * FROM incident")
    List<IncidentDetail> getIncidents();

    @Insert
    void insertIncident(List<IncidentDetail> incident);

}
