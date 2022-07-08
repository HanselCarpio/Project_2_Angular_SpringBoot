package com.example.labspringboot.domain;

import javax.persistence.*;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idvehicle;
    @ManyToOne
    @JoinColumn(name = "idtype")
    private Typevehicle idtype;
    private String brand;
    private String model;
    private String color;
    private int year;
    private String register;
    private String description;
    private char state;

    public Vehicle() {
    }

    public Vehicle(int idvehicle, Typevehicle idtype, String brand, String model, String color, int year, String register, String description, char state) {
        this.setIdvehicle(idvehicle);
        this.setIdtype(idtype);
        this.setBrand(brand);
        this.setModel(model);
        this.setColor(color);
        this.setYear(year);
        this.setRegister(register);
        this.setDescription(description);
        this.setState(state);
    }

    public int getIdvehicle() {
        return idvehicle;
    }

    public void setIdvehicle(int idvehicle) {
        this.idvehicle = idvehicle;
    }

    public Typevehicle getIdtype() {
        return idtype;
    }

    public void setIdtype(Typevehicle idtype) {
        this.idtype = idtype;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "idvehicle=" + idvehicle +
                ", idtype=" + idtype +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", register='" + register + '\'' +
                ", description='" + description + '\'' +
                ", state=" + state +
                '}';
    }
}
