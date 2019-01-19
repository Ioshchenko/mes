package com.mes.domain;


import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@Data
@NodeEntity
public class Symptom {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @Relationship(type = "S_WITH")
    private List<Disease> disease;
}
