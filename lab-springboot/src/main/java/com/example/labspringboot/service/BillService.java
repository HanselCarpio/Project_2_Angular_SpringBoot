package com.example.labspringboot.service;

import com.example.labspringboot.domain.Bill;
import com.example.labspringboot.domain.Rol;
import com.example.labspringboot.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BillService {
    @Autowired
    private BillRepository repository;

    public List<Bill> listAll() {
        return repository.findAll();
    }

    public void save(Bill bill) {
        repository.save(bill);
    }

    public Bill get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
