package com.attaditya.parkinglot.repositories;

import com.attaditya.parkinglot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private final Map<Long, Gate> gates = new HashMap<>();

    private Gate save(Gate gate) {
        gates.put(gate.getId(), gate);
        return gate;
    }

    public Optional<Gate> findById(long gateId) {
        if (gates.containsKey(gateId)) {
            return Optional.of(gates.get(gateId));
        }

        return Optional.empty();
    }
}
