package solutis.elasticcode.desafio_locadora_carros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import solutis.elasticcode.desafio_locadora_carros.entity.carro.Carro;
import solutis.elasticcode.desafio_locadora_carros.service.CarroService;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroService service;

    @PostMapping
    public ResponseEntity<Carro> cadastrarCarro(Carro carro) {
        if (carro == null) {
            return ResponseEntity.badRequest().build();
        }

        Carro cadastrar = service.cadastrarCarro(carro);
        return ResponseEntity.status(201).body(cadastrar);
    }

    @GetMapping
    public ResponseEntity<List<Carro>> listarCarro() {
        return ResponseEntity.status(200).body(service.listarCarro());
    }

}
