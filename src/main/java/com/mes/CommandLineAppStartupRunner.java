package com.mes;

import com.mes.domain.Disease;
import com.mes.repository.DiseaseRepository;
import com.mes.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    @Autowired
    PatientRepository patientRepository;

    @Autowired
    DiseaseRepository diseaseRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Disease> diseases = new Data().getDiseases();

        diseaseRepository.saveAll(diseases);

        Iterable<Disease> all = diseaseRepository.findAll();
        all.forEach(System.out::println);


    }
}