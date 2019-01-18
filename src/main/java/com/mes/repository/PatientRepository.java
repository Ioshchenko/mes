package com.mes.repository;

import com.mes.domain.Patient;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends Neo4jRepository<Patient, Long> {
}
