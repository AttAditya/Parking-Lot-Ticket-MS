package com.attaditya.parkinglot.services;

import com.attaditya.parkinglot.enums.VehicleType;
import com.attaditya.parkinglot.exceptions.InvalidGateException;
import com.attaditya.parkinglot.models.Gate;
import com.attaditya.parkinglot.models.Ticket;
import com.attaditya.parkinglot.repositories.GateRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private final GateRepository gateRepository;

    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber, VehicleType vehicleType, String ownerName) {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);

        if (optionalGate.isEmpty()) {
            throw new InvalidGateException("Invalid gate id");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());

        // TODO: check for vehicle, if present get it else save it.

        return ticket;
    }
}
