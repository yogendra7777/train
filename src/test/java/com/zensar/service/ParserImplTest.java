package com.zensar.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.zensar.dto.TrainDto;
import com.zensar.service.impl.ParserImpl;

public class ParserImplTest {
    Parser routeParser = new ParserImpl();
    List<TrainDto> trainList = new ArrayList<>();
    Map<String,TrainDto> trainAMap = new HashMap<>();
    Map<String,TrainDto> trainBMap = new HashMap<>();
    TrainDto train_A = new TrainDto("HYB", true, false, 100);
    TrainDto train_B = new TrainDto("SLM", true, false, 500);
    @Test
    public void testParse(){
        trainAMap.put("HYB", train_A);
        trainBMap.put("SLM", train_A);
        trainList.add(0, train_A);
        Assertions.assertEquals(trainList, routeParser.parse("HYB", trainAMap, trainBMap));
    }
    @Test
    public void testFailParse(){
        trainAMap.put("HYB", train_A);
        trainBMap.put("SLM", train_A);
        Assertions.assertEquals(trainList, routeParser.parse("SLM", trainAMap, trainBMap));
    }
}
