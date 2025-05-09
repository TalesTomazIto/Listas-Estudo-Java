package solutis.elasticcode.exercicio_tests.controller;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import solutis.elasticcode.exercicio_tests.dto.TarefaRequestDto;
import solutis.elasticcode.exercicio_tests.dto.TarefaResponseDto;
import solutis.elasticcode.exercicio_tests.entity.Tarefa;
import solutis.elasticcode.exercicio_tests.service.TarefaService;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> handleEntityNotFound(EntityNotFoundException ex) {
        return ResponseEntity.status(404).body(ex.getMessage());
    }

    @Autowired
    public TarefaService tarefaService;


    @PostMapping
    public ResponseEntity<TarefaResponseDto> cadastrarTarefa(@RequestBody @Valid TarefaRequestDto request) {
        return ResponseEntity.status(201).body(tarefaService.cadastrarTarefa(request));
    }

    @GetMapping
    public ResponseEntity<List<Tarefa>> listarTarefas() {
        return ResponseEntity.status(200).body(tarefaService.listarTarefas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TarefaResponseDto> buscarTarefaPorId(@PathVariable Long id) {
        return ResponseEntity.status(200).body(tarefaService.buscarTarefaPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TarefaResponseDto> atualizarTarefa(@PathVariable Long id, @RequestBody TarefaRequestDto request) {
        return ResponseEntity.status(200).body(tarefaService.atualizarTarefa(id, request));
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletarTarefa(@PathVariable Long id) {
        tarefaService.deletarTarefa(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<String> deletarTarefaPorNome(@PathVariable String nome) {
        TarefaResponseDto encontrado = tarefaService.buscarTarefaPorNome(nome);
        return ResponseEntity.status(200).body(encontrado.titulo());
    }
}
