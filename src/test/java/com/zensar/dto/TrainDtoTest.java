package com.zensar.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrainDtoTest {
    TrainDto train_A = new TrainDto("HYB", true, false, 100);
    TrainDto train_B = new TrainDto("SLM", true, false, 500);
    @Test
    public void testTrainDto(){
        Assertions.assertEquals(400, train_A.compareTo(train_B));
        Assertions.assertEquals("HYB", train_A.getStationCode());
        Assertions.assertEquals(100, train_A.getDistance());
        Assertions.assertEquals(true, train_A.isMergeStation());
        Assertions.assertEquals(false, train_A.isPartedStation());
        train_B.setStationCode("HYB");
        Assertions.assertEquals("HYB", train_B.getStationCode());
        train_B.setMergeStation(false);
        Assertions.assertEquals(false, train_B.isMergeStation());
        train_B.setPartedStation(true);
        Assertions.assertEquals(true, train_B.isPartedStation());
        train_B.setDistance(4000);
        Assertions.assertEquals(4000, train_B.getDistance());
    }
}
