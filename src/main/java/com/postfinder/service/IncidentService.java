package com.postfinder.service;

import com.postfinder.model.IncidentV2Model;
import com.postfinder.repository.IncidentRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentService {

    @Autowired
    private IncidentRepository incidentRepository;

    public List<IncidentV2Model> getAllIncidents() { return this.incidentRepository.findAll(); }

    // function to get all incidents by battallion_id (as batId in code)
    public List<IncidentV2Model> getAllIncidentsByBatallionId(int id) {
        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();

        Query query = session.createSQLQuery(
                "select * from  incident_v2 i,location l where (i.battalion_id = :batId and i.battalion_id = l.user_id) " +
                        "AND (l.status = false ) AND (l.incident_v2_id = i.id) group by i.id, l.id, l.incident_v2_id")
                .addEntity(IncidentV2Model.class)
                .setParameter("batId", id);
        List result = query.list();

        return result;
    }
}