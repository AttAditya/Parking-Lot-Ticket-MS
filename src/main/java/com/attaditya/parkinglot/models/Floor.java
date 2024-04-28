package com.attaditya.parkinglot.models;

import com.attaditya.parkinglot.enums.FloorStatus;

import java.util.List;

public class Floor extends BaseModel {
    private ParkingLot parkingLot;
    private Integer levelNumber;
    private List<Spot> spots;
    private FloorStatus status;

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Integer getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(Integer levelNumber) {
        this.levelNumber = levelNumber;
    }

    public List<Spot> getSpots() {
        return spots;
    }

    public void setSpots(List<Spot> spots) {
        this.spots = spots;
    }

    public FloorStatus getStatus() {
        return status;
    }

    public void setStatus(FloorStatus status) {
        this.status = status;
    }
}
