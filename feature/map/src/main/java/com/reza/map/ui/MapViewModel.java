package com.reza.map.ui;

import android.location.Location;

import androidx.lifecycle.ViewModel;

import com.reza.location.LocationManager;

import javax.inject.Inject;

import io.reactivex.Single;

public class MapViewModel extends ViewModel {

    final LocationManager locationManager;

    @Inject
    public MapViewModel(LocationManager locationManager) {
        this.locationManager = locationManager;
    }

    public Single<Location> getLastLocation() {
        return locationManager.getLastLocation();
    }
}
