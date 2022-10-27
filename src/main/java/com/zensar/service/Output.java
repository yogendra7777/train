package com.zensar.service;

import java.util.List;

import com.zensar.dto.TrainDto;

public interface Output {
    public void output(String prefix, List<TrainDto> list);
}
