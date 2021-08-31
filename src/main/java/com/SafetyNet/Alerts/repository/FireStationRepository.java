package com.SafetyNet.Alerts.repository;



import com.SafetyNet.Alerts.model.FireStation;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FireStationRepository {
    private final DataHandler dataHandler;

    public FireStationRepository(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    public List<FireStation> findAllFireStationByNumber(String number){
        return dataHandler.getData().getFirestations().stream()
                .filter(firestation ->firestation.getStation().equals(number))
                .collect(Collectors.toList());
    }

    public List<FireStation> findAllFireStationByAddress(String address) {
        return dataHandler.getData().getFirestations().stream()
                .filter(fireStation -> fireStation.getAddress().equals(address)).collect(Collectors.toList());
    }
}


