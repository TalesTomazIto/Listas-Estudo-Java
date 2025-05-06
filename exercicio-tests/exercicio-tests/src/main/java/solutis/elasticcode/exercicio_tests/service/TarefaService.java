package solutis.elasticcode.exercicio_tests.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutis.elasticcode.exercicio_tests.dto.TarefaRequestDto;
import solutis.elasticcode.exercicio_tests.dto.TarefaResponseDto;
import solutis.elasticcode.exercicio_tests.entity.Tarefa;
import solutis.elasticcode.exercicio_tests.mapper.TarefaMapper;
import solutis.elasticcode.exercicio_tests.repository.TarefaRepository;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public TarefaResponseDto cadastrarTarefa(TarefaRequestDto requestDto) {
        Tarefa tarefa = TarefaMapper.toEntity(requestDto);
        tarefaRepository.save(tarefa);

        TarefaResponseDto response = TarefaMapper.toResponse(tarefa);
        return response;
    }

    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    public TarefaResponseDto buscarTarefaPorId(Long id) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tarefa com ID " + id + " não encontrada"));
        return TarefaMapper.toResponse(tarefa);
    }

    public TarefaResponseDto atualizarTarefa(Long id, TarefaRequestDto request) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tarefa com ID " + id + " não encontrada"));

        tarefa.setId(id);
        tarefa.setTitulo(request.titulo());
        tarefa.setDescricao(request.descricao());
        tarefa.setStatus(request.status());

        tarefaRepository.save(tarefa);

        return TarefaMapper.toResponse(tarefa);
    }

    public void deletarTarefa(Long id) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tarefa com ID " + id + " não encontrada"));

        tarefaRepository.delete(tarefa);
    }
}
