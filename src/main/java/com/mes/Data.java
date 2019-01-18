package com.mes;

import com.mes.domain.Disease;
import com.mes.domain.Symptom;

import java.util.Arrays;
import java.util.List;

public class Data {
    public  List<Disease> getDiseases() {
        Symptom temperature = getSymptom("Temperature rise.");
        Symptom runnyNose = getSymptom("Long runny nose.");
        Symptom drySkin = getSymptom("Dry skin.");
        Symptom hairLoss = getSymptom("Hair loss.");
        Symptom headache = getSymptom("Headache.");
        Symptom coughing = getSymptom("Coughing.");
        Symptom sneezing = getSymptom("Sneezing.");
        Symptom nasal = getSymptom("Nasal discharge.");
        Symptom gums = getSymptom("Bleeding gums.");


        Disease sinusitis = getDisease("Sinusitis");
        sinusitis.setSymptoms(Arrays.asList(temperature, runnyNose));

        Disease avitaminosis = getDisease("Avitaminosis");
        avitaminosis.setSymptoms(Arrays.asList(drySkin, hairLoss, gums));

        Disease allergies = getDisease("Allergies");
        avitaminosis.setSymptoms(Arrays.asList(coughing, sneezing, nasal));

        Disease flu = getDisease("Flu");
        avitaminosis.setSymptoms(Arrays.asList(coughing, sneezing, headache, temperature, nasal));


        return Arrays.asList(sinusitis, avitaminosis, allergies, flu);
    }

    private Symptom getSymptom(String s) {
        Symptom hairLoss = new Symptom();
        hairLoss.setTitle(s);
        return hairLoss;
    }

    private Disease getDisease(String name) {
        Disease sinusitis = new Disease();
        sinusitis.setTitle(name);
        return sinusitis;
    }


}
