package com.example.labspringboot.domain;

import javax.persistence.*;
@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idrol;
    private String name;
    private int authority;

    public Rol() {

    }

    public Rol(int idrol, String name, int authority) {
        this.setIdrol(idrol);
        this.setName(name);
        this.setAuthority(authority);
    }


    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "idRol=" + idrol +
                ", name='" + name + '\'' +
                ", authority=" + authority +
                '}';
    }
}