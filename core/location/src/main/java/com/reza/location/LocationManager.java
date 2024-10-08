package com.reza.location;

import android.location.Location;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Single;

/**
 * Provides methods for managing and accessing location data.
 */
public interface LocationManager {

    /**
     * Retrieves the last known location of the device.
     */
    Single<Location> getLastLocation();

    /**
     * Provides a stream of location updates.
     */
    Flowable<Location> getLocationUpdates();

    /**
     * Starts location updates.
     */
    Completable startLocationUpdates();

    /**
     * Stops location updates.
     */
    Completable stopLocationUpdates();
}