package com.SafetyNet.Alerts.repository;

import com.SafetyNet.Alerts.model.MedicalRecord;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class MedicalRecordsRepository {
    private final DataHandler dataHandler;

    public MedicalRecordsRepository(DataHandler dataHandler) {this.dataHandler=dataHandler;}

    public List<MedicalRecord> findAllMedicalRecords() {
        return dataHandler.getData().getMedicalrecords();
    }
}

