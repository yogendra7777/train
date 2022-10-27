package com.zensar.service;

import java.util.LinkedHashMap;
import java.util.Map;

import com.zensar.dto.TrainDto;
import com.zensar.utils.StationCodes;

public interface RoutesDef {
    static Map<String, TrainDto> A_TRAIN_ = new LinkedHashMap<>();
    static Map<String, TrainDto> B_TRAIN_ = new LinkedHashMap<>();
    public static void start(){
        A_TRAIN_.put(StationCodes.CHN.name(), new TrainDto(StationCodes.CHN.name(), 0));
        A_TRAIN_.put(StationCodes.SLM.name(), new TrainDto(StationCodes.SLM.name(), 350));
        A_TRAIN_.put(StationCodes.BLR.name(), new TrainDto(StationCodes.BLR.name(), 550));
        A_TRAIN_.put(StationCodes.KRN.name(), new TrainDto(StationCodes.KRN.name(), 900));
        A_TRAIN_.put(StationCodes.HYB.name(), new TrainDto(StationCodes.HYB.name(),true, 1200));
        A_TRAIN_.put(StationCodes.NGP.name(), new TrainDto(StationCodes.NGP.name(),true, 1600));
        A_TRAIN_.put(StationCodes.ITJ.name(), new TrainDto(StationCodes.ITJ.name(),true, 1900));
        A_TRAIN_.put(StationCodes.BPL.name(), new TrainDto(StationCodes.BPL.name(),true, 2000));
        A_TRAIN_.put(StationCodes.AGA.name(), new TrainDto(StationCodes.AGA.name(),false,true, 2500));
        A_TRAIN_.put(StationCodes.NDL.name(), new TrainDto(StationCodes.NDL.name(),false,true, 2700));

        B_TRAIN_.put(StationCodes.TVC.name(), new TrainDto(StationCodes.TVC.name(), 0));
        B_TRAIN_.put(StationCodes.SRR.name(), new TrainDto(StationCodes.SRR.name(), 300));
        B_TRAIN_.put(StationCodes.MAQ.name(), new TrainDto(StationCodes.MAQ.name(), 600));
        B_TRAIN_.put(StationCodes.MAO.name(), new TrainDto(StationCodes.MAO.name(), 1000));
        B_TRAIN_.put(StationCodes.PNE.name(), new TrainDto(StationCodes.PNE.name(), 1400));
        B_TRAIN_.put(StationCodes.HYB.name(), new TrainDto(StationCodes.HYB.name(), true,2000));
        B_TRAIN_.put(StationCodes.NGP.name(), new TrainDto(StationCodes.NGP.name(), true,2400));
        B_TRAIN_.put(StationCodes.ITJ.name(), new TrainDto(StationCodes.ITJ.name(), true,2700));
        B_TRAIN_.put(StationCodes.BPL.name(), new TrainDto(StationCodes.BPL.name(), true,2800));
        B_TRAIN_.put(StationCodes.PTA.name(), new TrainDto(StationCodes.PTA.name(), false,true,3800));
        B_TRAIN_.put(StationCodes.NJP.name(), new TrainDto(StationCodes.NJP.name(),false, true,4200));
        B_TRAIN_.put(StationCodes.GHY.name(), new TrainDto(StationCodes.GHY.name(), false,true,4700));
    }
    public static int getTrain_Distance(String code, Map<String, TrainDto> map) {
		return map.get(code).getDistance();
	}
}
