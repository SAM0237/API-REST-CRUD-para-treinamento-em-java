package com.sahmyr.API_CRUD_REST_FORgithub.Controllers;

import com.sahmyr.API_CRUD_REST_FORgithub.Models.Pedidos;
import com.sahmyr.API_CRUD_REST_FORgithub.repositry.PedidosRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {
    //CONSTRUTOR DO REPOSITORIO PARA INSERIR NAS ROTAS USANDO O JPA
    private final PedidosRepository repository;
    public PedidosController(PedidosRepository repository){this.repository = repository;}

    //rotas de get e post

    @PostMapping
    public Pedidos criarpedido(@RequestBody Pedidos pedidonovo){
        return repository.save(pedidonovo);
    }
    @GetMapping
    List<Pedidos> PuxarPedidos(){
        return repository.findAll();
    }

}
