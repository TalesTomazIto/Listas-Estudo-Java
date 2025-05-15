package solutis.elasticcode.desafio_locadora_carros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import solutis.elasticcode.desafio_locadora_carros.entity.carro.Fabricante;
import solutis.elasticcode.desafio_locadora_carros.entity.carro.ModeloCarro;
import solutis.elasticcode.desafio_locadora_carros.service.FabricanteService;
import solutis.elasticcode.desafio_locadora_carros.service.ModeloCarroService;

import java.util.List;

@RestController
@RequestMapping("/modelocarros")
public class ModeloCarroController {

    @Autowired
    private ModeloCarroService service;

    @PostMapping
    public ResponseEntity<ModeloCarro> cadastrarModelosCarros(ModeloCarro modeloCarro) {
        if (modeloCarro == null) {
            return ResponseEntity.badRequest().build();
        }

        ModeloCarro cadastrar = service.cadastrar(modeloCarro);
        return ResponseEntity.status(201).body(cadastrar);
    }

    @GetMapping
    public ResponseEntity<List<ModeloCarro>> listarModeloCarros() {
        return ResponseEntity.status(200).body(service.listarModelosCarros());
    }
}
