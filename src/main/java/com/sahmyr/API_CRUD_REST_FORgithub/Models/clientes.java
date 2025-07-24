package com.sahmyr.API_CRUD_REST_FORgithub.Models;

import jakarta.persistence.*;


@Entity
//@Table(name = "clientes")
public class clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;

    private String nome;
    private String email;

    public clientes() {}

    public clientes (String nome, String email) {
        this.nome = nome;
        this.email = email;

    }
    //getters and setters
    public Integer getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}


