package com.mes.repository;

import com.mes.domain.Disease;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseaseRepository extends Neo4jRepository<Disease, Long> {
}
