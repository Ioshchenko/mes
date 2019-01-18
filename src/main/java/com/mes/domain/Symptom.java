package com.mes.domain;


import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@Data
@RelationshipEntity(type = "SICK_WITH")
public class Symptom {
    @Id
    @GeneratedValue
    private int id;
    private List<String> symptoms;

    @StartNode
    private Patient patient;
    @EndNode
    private Disease disease;
}
