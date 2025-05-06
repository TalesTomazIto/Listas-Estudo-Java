package solutis.elasticcode.exercicio_tests.controller;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
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

    public final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

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

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTarefa(@PathVariable Long id) {
        tarefaService.deletarTarefa(id);
        return ResponseEntity.noContent().build(); // HTTP 204
    }
}
