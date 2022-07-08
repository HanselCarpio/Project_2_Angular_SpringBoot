package com.example.labspringboot.service;

import com.example.labspringboot.domain.Bill;
import com.example.labspringboot.domain.Fee;
import com.example.labspringboot.repository.BillRepository;
import com.example.labspringboot.repository.FeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FeeService {

    @Autowired
    private FeeRepository repository;

    public List<Fee> listAll() {
        return repository.findAll();
    }

    public void save(Fee fee) {
        repository.save(fee);
    }

    public Fee get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

}
