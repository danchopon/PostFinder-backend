package com.postfinder.controller;

import com.postfinder.model.IncidentV2Model;
import com.postfinder.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IncidentController {

    @Autowired
    private IncidentService incidentService;

    @GetMapping("/incidents")
    public List<IncidentV2Model> getAllIncidents() { return incidentService.getAllIncidents(); }

    @GetMapping("/incidents/{battalionId}")
    public List<IncidentV2Model> getAllIncidentsByBattaionId(@PathVariable int battalionId) {
        return incidentService.getAllIncidentsByBatallionId(battalionId);
    }
}
