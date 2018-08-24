package com.postfinder.repository;

import com.postfinder.model.LocationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<LocationModel, Long> {
    LocationModel findByIncidentV2Id(long incident_v2_id);
}
