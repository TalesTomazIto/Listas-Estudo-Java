package solutis.elasticcode.desafio_locadora_carros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import solutis.elasticcode.desafio_locadora_carros.entity.ApoliceSeguro;
import solutis.elasticcode.desafio_locadora_carros.service.ApoliceSeguroService;

import java.util.List;

@RestController
@RequestMapping("/apoliceseguros")
public class ApoliceSeguroController {

    @Autowired
    private ApoliceSeguroService service;

    @PostMapping
    public ResponseEntity<ApoliceSeguro> cadastrarApoliceSeguro(ApoliceSeguro seguro) {
        if (seguro == null) {
            return ResponseEntity.badRequest().build();
        }

        ApoliceSeguro apoliceSeguro = service.cadastrar(seguro);
        return ResponseEntity.status(201).body(apoliceSeguro);
    }

    @GetMapping
    public ResponseEntity<List<ApoliceSeguro>> listarApoliceSeguros() {
        return ResponseEntity.status(200).body(service.listarSeguros());
    }
}
