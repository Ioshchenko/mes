package com.mes.domain;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@Data
@NodeEntity
public class Disease {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

    @Relationship(type = "SICK_WITH", direction = Relationship.INCOMING)
    private List<Symptom> symptoms;
}
