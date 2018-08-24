package com.postfinder.controller;

import com.postfinder.model.LocationModel;
import com.postfinder.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/locations")
    public List<LocationModel> getAllUsersLocation() { return locationService.getAllUsersLocation(); }

    @PostMapping("/locations/add")
    public LocationModel insertLocation(@RequestBody LocationModel locationModel) {
        locationService.insertLocation(locationModel);
        return locationModel;
    }

    @PutMapping("locations/{locationId}")
    public LocationModel updateLocation(@PathVariable Long locationId, @RequestBody LocationModel locationModel) {
        locationService.updateLocation(locationId, locationModel);
        return locationModel;
    }

    @PostMapping("/locations/addUpdate")
    public LocationModel insertAndUpdateLocation(@RequestBody LocationModel locationModel) {
        LocationModel locationModelRefreshed = locationService.insertAndUpdateLocation(locationModel);
        return locationModelRefreshed;
    }
}
