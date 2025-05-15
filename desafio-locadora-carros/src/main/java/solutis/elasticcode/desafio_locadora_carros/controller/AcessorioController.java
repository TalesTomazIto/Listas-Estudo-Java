package solutis.elasticcode.desafio_locadora_carros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import solutis.elasticcode.desafio_locadora_carros.entity.ApoliceSeguro;
import solutis.elasticcode.desafio_locadora_carros.entity.carro.Acessorio;
import solutis.elasticcode.desafio_locadora_carros.service.AcessorioService;

import java.util.List;

@RestController
@RequestMapping("/acessorios")
public class AcessorioController {

    @Autowired
    private AcessorioService service;

    @PostMapping
    public ResponseEntity<Acessorio> cadastrarAcessorios(Acessorio acessorio) {
        if (acessorio == null) {
            return ResponseEntity.badRequest().build();
        }

        Acessorio cadastrar = service.cadastrar(acessorio);
        return ResponseEntity.status(201).body(cadastrar);
    }

    @GetMapping
    public ResponseEntity<List<Acessorio>> listarAcessorios() {
        return ResponseEntity.status(200).body(service.listarAcessorios());
    }
}
