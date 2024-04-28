package com.attaditya.parkinglot.models;

import com.attaditya.parkinglot.enums.ParkingLotStatus;

import java.util.List;

public class ParkingLot extends BaseModel {
    private List<Floor> floors;
    private List<Gate> gates;
    private ParkingLotStatus status;

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }
}
