package com.sahmyr.API_CRUD_REST_FORgithub.Controllers;

import com.sahmyr.API_CRUD_REST_FORgithub.Models.clientes;
import com.sahmyr.API_CRUD_REST_FORgithub.repositry.clientesRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/clientes")
public class clientescontroller {

    private final clientesRepository repository;


    protected clientescontroller(clientesRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public clientes criarcliente(@RequestBody clientes novocliente){

        return repository.save(novocliente);

    }

    @GetMapping
    List<clientes> todosclientes(){
        return repository.findAll();
    }

}
