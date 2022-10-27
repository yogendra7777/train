package com.zensar.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.zensar.dto.TrainDto;
import com.zensar.service.Tour;
import com.zensar.service.RoutesDef;
import com.zensar.utils.Constants;

public class TourImpl implements Tour,RoutesDef{
    static {
		RoutesDef.start(); 
	}
    @Override
    public List<TrainDto> arrival(List<TrainDto> trainList, int merge_distance) {
        return trainList.stream().filter(train -> train.getDistance() >= merge_distance).collect(Collectors.toList());
    }
    @Override
    public List<TrainDto> departure(List<TrainDto> trainA, List<TrainDto> trainB) {
		List<TrainDto> trainAB = Stream.of(trainA, trainB).flatMap(x -> x.stream()).collect(Collectors.toList());
        Collections.sort(trainAB); 
		return trainAB.stream().filter(train -> train.getStationCode() != INIITAL_MERGE_STATION).collect(Collectors.toList()); 
    }
    @Override
    public String arrivalPrefix(String train) {
        StringBuilder pre_train = new StringBuilder();
		pre_train.append(Constants.ARRIVAL);
		pre_train.append(Constants.SPACE);
		pre_train.append(train);
		pre_train.append(Constants.SPACE);
		pre_train.append(Constants.ENGINE);
		return pre_train.toString();
    }
    @Override
    public String departurePrefix(String train) {
        StringBuilder pre_train = new StringBuilder();
		pre_train.append(Constants.DEPARTURE);
		pre_train.append(Constants.SPACE);
		pre_train.append(train);
		pre_train.append(Constants.SPACE);
		pre_train.append(Constants.ENGINE);
		pre_train.append(Constants.SPACE);
		pre_train.append(Constants.ENGINE);
		return pre_train.toString();
    }
}
