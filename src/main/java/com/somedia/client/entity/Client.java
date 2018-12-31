package com.somedia.client.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private  String nom;
    private  String prénom;
    private  String email;
    private  String password;

    public Client() {
    }

    public Client(String nom, String prénom, String email, String password) {
        this.nom = nom;
        this.prénom = prénom;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Client(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
