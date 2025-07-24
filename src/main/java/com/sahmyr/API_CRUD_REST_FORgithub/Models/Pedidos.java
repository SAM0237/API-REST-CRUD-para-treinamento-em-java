package com.sahmyr.API_CRUD_REST_FORgithub.Models;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;

    private String produto;
    private double preco;

    private LocalDateTime datahoraatual = LocalDateTime.now();

    //Construtores
    public Pedidos(){}

    public Pedidos(String produto, Double preco, LocalDateTime datahoraatual){
        this.produto = produto;
        this.preco = preco;
        this.datahoraatual = datahoraatual;
    }

    //Getters and Setters:
    public void SetIdCliente(Integer idcliente){this.idcliente = idcliente;}
    public Integer GetIdCliente(){return idcliente;}
    public void SetProduto(String produto){this.produto = produto;}
    public String GetProduto(){return produto;}
    public void SetDataHoraAtual(LocalDateTime DataHoraAtual){this.datahoraatual = DataHoraAtual;}
    public LocalDateTime DataHoraAtual(){return datahoraatual;}


}
