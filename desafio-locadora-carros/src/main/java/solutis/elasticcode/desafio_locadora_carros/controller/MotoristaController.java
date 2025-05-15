package solutis.elasticcode.desafio_locadora_carros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import solutis.elasticcode.desafio_locadora_carros.dto.funcionario.FuncionarioRequestDto;
import solutis.elasticcode.desafio_locadora_carros.dto.funcionario.FuncionarioResponseDto;
import solutis.elasticcode.desafio_locadora_carros.dto.motorista.MotoristaRequestDto;
import solutis.elasticcode.desafio_locadora_carros.dto.motorista.MotoristaResponseDto;
import solutis.elasticcode.desafio_locadora_carros.entity.pessoa.Funcionario;
import solutis.elasticcode.desafio_locadora_carros.entity.pessoa.Motorista;
import solutis.elasticcode.desafio_locadora_carros.service.FuncionarioService;
import solutis.elasticcode.desafio_locadora_carros.service.MotoristaService;

import java.util.List;

@RestController
@RequestMapping("/motoristas")
public class MotoristaController {

    @Autowired
    private MotoristaService service;

    @PostMapping
    public ResponseEntity<Motorista> cadastrar(@RequestBody MotoristaRequestDto request) {
        if (request == null) {
            return ResponseEntity.badRequest().build();
        }

        Motorista motorista = service.cadasrarMotorista(request);
        return ResponseEntity.status(201).body(motorista);
    }

    @GetMapping
    public ResponseEntity<List<MotoristaResponseDto>> listarUsuarios() {
        return ResponseEntity.status(200).body(service.listarMotoristas());
    }
}
