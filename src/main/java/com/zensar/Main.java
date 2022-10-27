package com.zensar;

import java.util.List;

import com.zensar.dto.TrainDto;
import com.zensar.service.FileInputReader;
import com.zensar.service.Tour;
import com.zensar.service.Output;
import com.zensar.service.Parser;
import com.zensar.service.RoutesDef;
import com.zensar.service.impl.FileInputReaderImpl;
import com.zensar.service.impl.TourImpl;
import com.zensar.service.impl.OutputImpl;
import com.zensar.service.impl.ParserImpl;
import com.zensar.utils.Constants;

public class Main {
    public static void main(String[] args) {
        FileInputReader inputReader = new FileInputReaderImpl();
        Parser routeParser = new ParserImpl();
        Tour journey = new TourImpl();
        Output outputWriter = new OutputImpl();
        String trips[] = inputReader.inputReader(args[0]);
        List<TrainDto> trip_TrainA = routeParser.parse(trips[0], RoutesDef.A_TRAIN_, RoutesDef.B_TRAIN_);
        List<TrainDto> trip_TrainB = routeParser.parse(trips[1], RoutesDef.B_TRAIN_, RoutesDef.A_TRAIN_);
        List<TrainDto> arrival_TrainA = journey.arrival(trip_TrainA, RoutesDef.getTrain_Distance(Tour.INIITAL_MERGE_STATION,RoutesDef.A_TRAIN_));
        List<TrainDto> arrival_TrainB = journey.arrival(trip_TrainB, RoutesDef.getTrain_Distance(Tour.INIITAL_MERGE_STATION,RoutesDef.B_TRAIN_));
        List<TrainDto> departure_TrainAB = journey.departure(arrival_TrainA, arrival_TrainB);
        outputWriter.output(journey.arrivalPrefix(Constants.TRAIN_A), arrival_TrainA);
        outputWriter.output(journey.arrivalPrefix(Constants.TRAIN_B), arrival_TrainB);
        outputWriter.output(journey.departurePrefix(Constants.TRAIN_AB), departure_TrainAB);
    }
}
