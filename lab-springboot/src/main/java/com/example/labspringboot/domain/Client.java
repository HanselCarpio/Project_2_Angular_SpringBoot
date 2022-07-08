package com.example.labspringboot.domain;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idclient;
    @ManyToOne
    @JoinColumn(name = "idvehicle")
    private Vehicle idvehicle;
    private String name;
    private String dni;
    private int age;
    private String telephone;
    private String email;
    private String password;
    @ManyToOne
    @JoinColumn(name = "idrol")
    private Rol idrol;
    private char state;

    public Client() {
    }

    public Client(int idclient, Vehicle idvehicle, String name, String dni, int age, String telephone, String email, String password, Rol idrol, char state) {
        this.idclient = idclient;
        this.idvehicle = idvehicle;
        this.name = name;
        this.dni = dni;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
        this.idrol = idrol;
        this.state = state;
    }

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    public Vehicle getIdvehicle() {
        return idvehicle;
    }

    public void setIdvehicle(Vehicle idvehicle) {
        this.idvehicle = idvehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getIdrol() {
        return idrol;
    }

    public void setIdrol(Rol idrol) {
        this.idrol = idrol;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idclient=" + idclient +
                ", idvehicle=" + idvehicle +
                ", name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", age=" + age +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", idrol=" + idrol +
                ", state=" + state +
                '}';
    }
}
