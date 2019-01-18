package com.mes.domain;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@Data
@NodeEntity
public class Patient {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private boolean travelHistory;

    @Relationship(type = "SICK_WITH")
    private List<Disease> diseases;
}
