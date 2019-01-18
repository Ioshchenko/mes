package com.mes;

import com.mes.domain.Patient;
import com.mes.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    @Autowired
    PatientRepository patientRepository;

    @Override
    public void run(String... args) throws Exception {
        Patient patient = new Patient();
        patient.setAge(23);
        patient.setName("Petia Petrov");

        patientRepository.save(patient);

        Iterable<Patient> all = patientRepository.findAll();
        all.forEach(System.out::println);

    }
}