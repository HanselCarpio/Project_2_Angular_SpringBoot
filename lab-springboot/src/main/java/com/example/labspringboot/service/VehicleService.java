package com.example.labspringboot.service;


import com.example.labspringboot.domain.Vehicle;
import com.example.labspringboot.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class VehicleService {

    @Autowired
    private VehicleRepository repository;

    public List<Vehicle> listAll() {
        return repository.findAll();
    }

    public void save(Vehicle vehicle) {
        repository.save(vehicle);
    }

    public Vehicle get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

}
