package com.zensar.service.impl;

import java.util.List;

import com.zensar.dto.TrainDto;
import com.zensar.service.Output;
import com.zensar.utils.Constants;

public class OutputImpl implements Output{
    @Override
    public void output(String pre_train, List<TrainDto> trainList) {
        StringBuilder tour = new StringBuilder();
		if (trainList.isEmpty())
			System.out.println(pre_train + Constants.SPACE + Constants.JOURNEY_ENDED);
		else {
			for (TrainDto train : trainList) {
				tour.append(Constants.SPACE);
				tour.append(train.getStationCode());
			}
			System.out.println(pre_train + tour);
		}    
    } 
}
