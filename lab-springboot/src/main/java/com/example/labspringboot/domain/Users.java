package com.example.labspringboot.domain;

import javax.persistence.*;

@Entity
public class Users{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iduser;
    private String name;
    private String dni;
    private int age;
    private String telephone;
    private String email;
    private String password;
    private char state;
    @ManyToOne
    @JoinColumn(name = "idrol")
    private Rol idrol;

    public Users() {
    }

    public Users(int iduser, Rol idrol, String name, String dni, int age, String telephone, String email, String password, char state) {
        this.setIduser(iduser);
        this.setIdrol(idrol);
        this.setName(name);
        this.setDni(dni);
        this.setAge(age);
        this.setTelephone(telephone);
        this.setEmail(email);
        this.setPassword(password);
        this.setState(state);
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int idUser) {
        this.iduser = iduser;
    }

    public Rol getIdrol() {
        return idrol;
    }

    public void setIdrol(Rol rol) {
        this.idrol = idrol;
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

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "User{" +
                "iduser=" + iduser +
                ", name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", age=" + age +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", state=" + state +
                ", rol=" + idrol +
                '}';
    }
}