package solutis.elasticcode.exercicio_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import solutis.elasticcode.exercicio_tests.dto.TarefaResponseDto;
import solutis.elasticcode.exercicio_tests.entity.Tarefa;
import solutis.elasticcode.exercicio_tests.repository.TarefaRepository;
import solutis.elasticcode.exercicio_tests.service.TarefaService;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TarefaServiceTest {

    @Mock
    private TarefaRepository tarefaRepository;

    private TarefaService tarefaService;

    @BeforeEach
    void setUp() {
        tarefaService = new TarefaService(tarefaRepository);
    }

    @Test
    void listarTarefas_deveRetornarListaDeTarefas() {
        List<Tarefa> tarefas = List.of(new Tarefa(1L, "Título", "Descrição", "PENDENTE"));
        when(tarefaRepository.findAll()).thenReturn(tarefas);

        List<Tarefa> resultado = tarefaService.listarTarefas();

        assertEquals(1, resultado.size());
        assertEquals("Título", resultado.get(0).getTitulo());
    }

    @Test
    void buscarTarefaPorId_tarefaExistente_deveRetornarTarefaResponseDto() {
        Tarefa tarefa = new Tarefa(1L, "Título", "Descrição", "PENDENTE");
        when(tarefaRepository.findById(1L)).thenReturn(Optional.of(tarefa));

        TarefaResponseDto resultado = tarefaService.buscarTarefaPorId(1L);

        assertEquals("Título", resultado.titulo());
        assertEquals("Descrição", resultado.descricao());
    }

    @Test
    void buscarTarefaPorId_tarefaInexistente_deveLancarExcecao() {
        when(tarefaRepository.findById(1L)).thenReturn(Optional.empty());

        assertThrows(EntityNotFoundException.class, () -> tarefaService.buscarTarefaPorId(1L));
    }

    @Test
    void deletarTarefa_tarefaExistente_deveDeletarTarefa() {
        Tarefa tarefa = new Tarefa(1L, "Título", "Descrição", "PENDENTE");
        when(tarefaRepository.findById(1L)).thenReturn(Optional.of(tarefa));

        tarefaService.deletarTarefa(1L);

        verify(tarefaRepository).delete(tarefa);
    }

    @Test
    void deletarTarefa_tarefaNaoExistente_deveLancarExcecao() {
        when(tarefaRepository.findById(1L)).thenReturn(Optional.empty());

        assertThrows(EntityNotFoundException.class, () -> tarefaService.deletarTarefa(1L));
    }
}
