package com.example.labspringboot.controller;

import com.example.labspringboot.domain.Parking;
import com.example.labspringboot.domain.Rol;
import com.example.labspringboot.service.ParkingService;
import com.example.labspringboot.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/api/parking")
public class ParkingController {

    @Autowired
    private ParkingService service;

    @GetMapping("/parkings")
    public List<Parking> list() {
        //¿reglas de negocio?
        //if...es admin
        return service.listAll();
    }

    @GetMapping("/parking/{id}")
    public ResponseEntity<Parking> get(@PathVariable Integer id) {
        try {
            Parking parking = service.get(id);
            return new ResponseEntity<Parking>(parking, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Parking>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public void add(Parking parking) {
        //reglas de negocio??
        service.save(parking);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Parking> update(@RequestBody Parking parking, @PathVariable Integer id) {
        try {
            service.save(parking);
            return new ResponseEntity<Parking>(parking, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Parking>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
