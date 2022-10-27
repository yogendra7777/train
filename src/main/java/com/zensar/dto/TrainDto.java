package com.zensar.dto;

public class TrainDto implements Comparable<TrainDto>{
    String stationCode;
    boolean mergedStation;
    boolean partedStation;
    int distance;
    public String getStationCode() {
        return stationCode;
    }
    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }
    public boolean isMergeStation() {
        return mergedStation;
    }
    public void setMergeStation(boolean mergeStation) {
        this.mergedStation = mergeStation;
    }
    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public boolean isPartedStation() {
        return partedStation;
    }
    public void setPartedStation(boolean partedStation) {
        this.partedStation = partedStation;
    }
    public TrainDto(String stationCode, int distance) {
        this.stationCode = stationCode;
        this.distance = distance;
    }
    public TrainDto(String stationCode, boolean mergeStation, int distance) {
        this.stationCode = stationCode;
        this.mergedStation = mergeStation;
        this.distance = distance;
    }
    public TrainDto(String stationCode, boolean mergeStation, boolean partedStation, int distance) {
        this.stationCode = stationCode;
        this.mergedStation = mergeStation;
        this.partedStation = partedStation;
        this.distance = distance;
    }
    @Override
	public int compareTo(TrainDto train) {
		return train.getDistance() - this.distance;
	}
}
