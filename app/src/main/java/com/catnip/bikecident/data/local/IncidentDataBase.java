package com.catnip.bikecident.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.catnip.bikecident.model.accident.IncidentDetail;

@Database(entities = {IncidentDetail.class}, version = 1)
public abstract class IncidentDataBase extends RoomDatabase {

    private static IncidentDataBase INSTANCE;

    public abstract IncidentDao incidentDao();

    private static final Object sLock = new Object();

    public static IncidentDataBase getInstance(Context context) {
        synchronized (sLock) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        IncidentDataBase.class, "Incident.db")
                        .build();
            }
            return INSTANCE;
        }
    }

}
