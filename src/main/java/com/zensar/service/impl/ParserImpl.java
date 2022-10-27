package com.zensar.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.zensar.dto.TrainDto;
import com.zensar.service.Tour;
import com.zensar.service.Parser;
import com.zensar.utils.Constants;

public class ParserImpl implements Parser{
    @Override
    public List<TrainDto> parse(String input, Map<String, TrainDto> initial, Map<String, TrainDto> merged) {
        List<TrainDto> train = new ArrayList<>();
		String[] compartments = input.split(Constants.SPACE);
		for (String compartment : compartments) {
			if (merged.get(compartment) != null && merged.get(compartment).isPartedStation())
				train.add(merged.get(compartment));
			if (initial.get(compartment) != null && merged.get(compartment) != null && initial.get(compartment).getStationCode() != Tour.INIITAL_MERGE_STATION)
				if (initial.get(compartment).getDistance() < merged.get(compartment).getDistance())
					train.add(initial.get(compartment));
				else
					train.add(merged.get(compartment));
			else if (initial.get(compartment) != null) 
				train.add(initial.get(compartment));
		}        
		return train;
    }  
}
