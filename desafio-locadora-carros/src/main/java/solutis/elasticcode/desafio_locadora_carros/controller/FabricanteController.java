package solutis.elasticcode.desafio_locadora_carros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import solutis.elasticcode.desafio_locadora_carros.entity.carro.Acessorio;
import solutis.elasticcode.desafio_locadora_carros.entity.carro.Fabricante;
import solutis.elasticcode.desafio_locadora_carros.service.AcessorioService;
import solutis.elasticcode.desafio_locadora_carros.service.FabricanteService;

import java.util.List;

@RestController
@RequestMapping("/fabricantes")
public class FabricanteController {

    @Autowired
    private FabricanteService service;

    @PostMapping
    public ResponseEntity<Fabricante> cadastrarFabricantes(Fabricante fabricante) {
        if (fabricante == null) {
            return ResponseEntity.badRequest().build();
        }

        Fabricante cadastrar = service.cadastrar(fabricante);
        return ResponseEntity.status(201).body(cadastrar);
    }

    @GetMapping
    public ResponseEntity<List<Fabricante>> listarAcessorios() {
        return ResponseEntity.status(200).body(service.listarFabricantes());
    }
}
