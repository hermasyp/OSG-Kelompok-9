package com.catnip.bikecident;

import android.content.Context;

import com.catnip.bikecident.data.IncidentRepository;
import com.catnip.bikecident.data.local.IncidentLocalDataSource;
import com.catnip.bikecident.data.remote.datasource.IncidentRemoteDataSource;

public class Injection {
    public static IncidentRepository provideIncidentRepository(Context context) {
        return new IncidentRepository(new IncidentRemoteDataSource(), new IncidentLocalDataSource(context));
    }
}
