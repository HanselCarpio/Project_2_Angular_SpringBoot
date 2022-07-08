package com.example.labspringboot.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idparking;
    private String parkingname;

    public Parking() {
    }

    public Parking(int idparking, String parkingname) {
        this.setIdparking(idparking);
        this.setParkingname(parkingname);
    }

    public int getIdparking() {
        return idparking;
    }

    public void setIdparking(int idparking) {
        this.idparking = idparking;
    }

    public String getParkingname() {
        return parkingname;
    }

    public void setParkingname(String parkingname) {
        this.parkingname = parkingname;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "idparking=" + idparking +
                ", parkingname='" + parkingname + '\'' +
                '}';
    }
}
