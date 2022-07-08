package com.example.labspringboot.controller;

import com.example.labspringboot.domain.Bill;
import com.example.labspringboot.domain.Fee;
import com.example.labspringboot.service.BillService;
import com.example.labspringboot.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/api/fee")
public class FeeController {


    @Autowired
    private FeeService service;

    @GetMapping("/fees")
    public List<Fee> list() {
        //¿reglas de negocio?
        //if...es admin
        return service.listAll();
    }

    @GetMapping("/fee/{id}")
    public ResponseEntity<Fee> get(@PathVariable Integer id) {
        try {
            Fee fee = service.get(id);
            return new ResponseEntity<Fee>(fee, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Fee>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public void add(Fee fee) {
        //reglas de negocio??
        service.save(fee);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Fee> update(@RequestBody Fee fee, @PathVariable Integer id) {
        try {
            service.save(fee);
            return new ResponseEntity<Fee>(fee, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Fee>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
