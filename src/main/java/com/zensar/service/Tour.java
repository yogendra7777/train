package com.zensar.service;

import java.util.List;

import com.zensar.dto.TrainDto;
import com.zensar.utils.StationCodes;

public interface Tour {
    public final static String INIITAL_MERGE_STATION = StationCodes.HYB.name(); 
	public List<TrainDto> arrival(List<TrainDto> trainList, int mergeKms);
	public List<TrainDto> departure(List<TrainDto> trainA, List<TrainDto> trainB);
	public String arrivalPrefix(String train);
	public String departurePrefix(String train);
}
