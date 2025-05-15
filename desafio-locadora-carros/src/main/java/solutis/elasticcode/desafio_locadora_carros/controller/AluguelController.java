package solutis.elasticcode.desafio_locadora_carros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import solutis.elasticcode.desafio_locadora_carros.entity.Aluguel;
import solutis.elasticcode.desafio_locadora_carros.service.AluguelService;

import java.util.List;

@RestController
@RequestMapping("/alugueis")
public class AluguelController {

    @Autowired
    private AluguelService service;

    @PostMapping
    public ResponseEntity<Aluguel> cadastrarAluguel(@RequestBody Aluguel aluguel) {
        if (aluguel == null) {
            return ResponseEntity.badRequest().build();
        }

        boolean carroAlugado = service.carroEstaAlugadoPorPlaca(aluguel.getCarro().getPlaca());

        if (carroAlugado) {
            return ResponseEntity.badRequest().body(null); // Retorna erro caso o carro já esteja alugado
        }

        Aluguel novoAluguel = service.cadastrar(aluguel);
        return ResponseEntity.status(201).body(novoAluguel); // Retorna sucesso no cadastro
    }

    @GetMapping
    public ResponseEntity<List<Aluguel>> listarAlugueis() {
        return ResponseEntity.status(200).body(service.listarAlugueis());
    }

    @GetMapping("/atrasados")
    public ResponseEntity<List<Aluguel>> listarAlugueisAtrasados() {
        return ResponseEntity.status(200).body(service.listarAlugueisAtrasados());
    }

    @GetMapping("/verificar/{placa}")
    public ResponseEntity<Boolean> verificarCarroAlugado(@PathVariable String placa) {
        boolean isAlugado = service.carroEstaAlugadoPorPlaca(placa);
        return ResponseEntity.ok(isAlugado);
    }
}
