package com.example.labspringboot.service;

import com.example.labspringboot.domain.Rol;
import com.example.labspringboot.domain.Users;
import com.example.labspringboot.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RolService {

    @Autowired
    private RolRepository repository;

    public List<?> getAllRoles() { return repository.getAllRoles();
    }

    //From the stored procedure
    public Rol getRol(int id) { return repository.getRol(id);
    }

    //From the stored procedure
    public void insertRolSP(Rol rol) { repository.insertRolSP(rol.getName(), rol.getAuthority());
    }

    //From the stored procedure
    public void updateRolSP(Rol rol) { repository.updateRolSP(rol.getIdrol(), rol.getName(), rol.getAuthority());
    }

    //From the stored procedure
    public void deleteRolSP(int id) { repository.deleteRolSP(id);
    }

    /*
    public List<Rol> listAll() {
        return repository.findAll();
    }

    public void save(Rol rol) {
        repository.save(rol);
    }

    public Rol get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }*/

}
