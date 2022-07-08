package com.example.labspringboot.service;

import com.example.labspringboot.domain.Parking;
import com.example.labspringboot.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ParkingService {

    @Autowired
    private ParkingRepository repository;

    public List<Parking> listAll() {
        return repository.findAll();
    }

    public void save(Parking parking) {
        repository.save(parking);
    }

    public Parking get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

}
