package com.example.labspringboot.domain;

import javax.persistence.*;

@Entity
public class Fee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idfee;
    @ManyToOne
    @JoinColumn(name = "idtypevehicle")
    private Typevehicle idtypevehicle;
    @ManyToOne
    @JoinColumn(name = "idtime")
    private Times idtime;
    private float price;

    public Fee() {
    }

    public Fee(int idfee, Typevehicle idtypevehicle, Times idtime, float price) {
        this.setIdfee(idfee);
        this.setIdtypevehicle(idtypevehicle);
        this.setIdtime(idtime);
        this.setPrice(price);
    }

    public int getIdfee() {
        return idfee;
    }

    public void setIdfee(int idfee) {
        this.idfee = idfee;
    }

    public Typevehicle getIdtypevehicle() {
        return idtypevehicle;
    }

    public void setIdtypevehicle(Typevehicle idtypevehicle) {
        this.idtypevehicle = idtypevehicle;
    }

    public Times getIdtime() {
        return idtime;
    }

    public void setIdtime(Times idtime) {
        this.idtime = idtime;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "idfee=" + idfee +
                ", idypevehicle=" + idtypevehicle +
                ", idtime=" + idtime +
                ", price=" + price +
                '}';
    }
}
