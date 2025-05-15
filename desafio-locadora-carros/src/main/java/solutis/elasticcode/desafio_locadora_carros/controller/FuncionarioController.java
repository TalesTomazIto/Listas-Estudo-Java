package solutis.elasticcode.desafio_locadora_carros.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import solutis.elasticcode.desafio_locadora_carros.dto.funcionario.FuncionarioRequestDto;
import solutis.elasticcode.desafio_locadora_carros.dto.funcionario.FuncionarioResponseDto;
import solutis.elasticcode.desafio_locadora_carros.entity.pessoa.Funcionario;
import solutis.elasticcode.desafio_locadora_carros.service.FuncionarioService;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @PostMapping
    public ResponseEntity<Funcionario> cadastrar(@RequestBody FuncionarioRequestDto request) {
        if (request == null) {
            return ResponseEntity.badRequest().build();
        }

        Funcionario funcionario = service.cadastrarFuncionario(request);
        return ResponseEntity.status(201).body(funcionario);
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioResponseDto>> listarUsuarios() {
        return ResponseEntity.status(200).body(service.listarFuncionarios());
    }
}
