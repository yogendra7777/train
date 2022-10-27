package com.zensar.service;

import java.util.List;
import java.util.Map;

import com.zensar.dto.TrainDto;

public interface Parser {
    public List<TrainDto> parse(String data, Map<String, TrainDto> intial, Map<String, TrainDto> merged);
}
