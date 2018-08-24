package com.postfinder.repository;

import com.postfinder.model.IncidentV2Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentRepository extends JpaRepository<IncidentV2Model, Long> {
}
