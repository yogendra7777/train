package com.zensar.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.zensar.dto.TrainDto;
import com.zensar.service.impl.TourImpl;

public class TourImplTest {
    Tour journey = new TourImpl();
    List<TrainDto> trainList_A = new ArrayList<>();
    List<TrainDto> trainList_B = new ArrayList<>();
    List<TrainDto> trainOutputList = new ArrayList<>();
    TrainDto train_A = new TrainDto("HYB", true, false, 100);
    TrainDto train_B = new TrainDto("SLM", true, false, 500);
    @Test
    public void testArrivalPrefix(){
        Assertions.assertEquals("ARRIVAL train ENGINE", journey.arrivalPrefix("train"));
    }
    @Test
    public void testDeparturePrefix(){
        Assertions.assertEquals("DEPARTURE train ENGINE ENGINE", journey.departurePrefix("train"));
    }
    @Test
    public void testArrival(){
        trainList_A.add(0, train_A);
        Assertions.assertEquals(trainOutputList, journey.arrival(trainList_A, 200));
    }
    @Test
    public void testDeparture(){
        trainList_A.add(0, train_A);
        trainList_B.add(0, train_B);
        trainOutputList = journey.departure(trainList_A, trainList_B);
        Assertions.assertEquals(trainList_B, trainOutputList);
    }
}
