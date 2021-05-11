package com.app.mytix.services;

import com.app.mytix.domain.Location;
import java.util.List;

public interface LocationService {
    List<Location> listAllLocations();
    Location getLocationById(Integer id);
    Location saveLocation(Location location);
    List<Location> saveLocationList(List<Location> locationList);

    void deleteLocation(Integer id);
}
