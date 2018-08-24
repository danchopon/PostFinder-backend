package com.postfinder.service;

import com.postfinder.exception.ResourceNotFoundException;
import com.postfinder.model.LocationModel;
import com.postfinder.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public List<LocationModel> getAllUsersLocation() { return locationRepository.findAll(); }

    public void insertLocation(LocationModel locationModel) {
        locationRepository.save(locationModel);
    }

    public void updateLocation(Long locationId, LocationModel locationModel) {
        locationRepository.findById(locationId)
                .map(location -> {
                    location.setLongitude(locationModel.getLongitude());
                    location.setLatitude(locationModel.getLatitude());
                    location.setStatus(locationModel.getStatus());
                    return locationRepository.save(location);
                }).orElseThrow(() -> new ResourceNotFoundException("Locaton with id " + locationId + "not found"));
    }

    public LocationModel insertAndUpdateLocation(LocationModel locationModel) {
        long incident = locationModel.getIncidentV2Id();
        LocationModel locationExistChecker =  locationRepository.findByIncidentV2Id(incident);
        if(locationExistChecker == null) {
            return locationRepository.save(locationModel);
        } else {
            locationRepository.findById(locationExistChecker.getId())
                    .map(location -> {
                        location.setLongitude(locationModel.getLongitude());
                        location.setLatitude(locationModel.getLatitude());
                        location.setStatus(locationModel.getStatus());
                        return locationRepository.save(location);
                    }).orElseThrow(() -> new ResourceNotFoundException("Locaton with id " + locationExistChecker.getId() + "not found"));
            return null;
        }
    }
}
