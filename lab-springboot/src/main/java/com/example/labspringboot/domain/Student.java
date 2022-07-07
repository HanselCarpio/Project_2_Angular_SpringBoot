package com.example.labspringboot.domain;


import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    @ManyToOne
    @JoinColumn(name = "MajorID")
    private Major major;
    /*@ManyToOne
    @JoinColumn(name = "Id_Nationality")
    private Nationality nationality;*/


    public Student() {
    }

    public Student(int id, String name, String email, String password, Major major/*, Nationality nationality*/) {


        this.setId(id);
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setMajor(major);
        //this.setNationality(nationality);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    /*public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }*/
}
