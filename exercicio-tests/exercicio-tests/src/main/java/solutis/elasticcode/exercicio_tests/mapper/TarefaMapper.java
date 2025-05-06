package solutis.elasticcode.exercicio_tests.mapper;

import solutis.elasticcode.exercicio_tests.dto.TarefaRequestDto;
import solutis.elasticcode.exercicio_tests.dto.TarefaResponseDto;
import solutis.elasticcode.exercicio_tests.entity.Tarefa;

public class TarefaMapper {

    public static Tarefa toEntity(TarefaRequestDto dto) {
        Tarefa tarefa = new Tarefa();

        tarefa.setTitulo(dto.titulo());
        tarefa.setDescricao(dto.descricao());
        tarefa.setStatus(dto.status());

        return tarefa;
    }

    public static Tarefa toEntity(TarefaResponseDto dto) {
        Tarefa tarefa = new Tarefa();

        tarefa.setTitulo(dto.titulo());
        tarefa.setDescricao(dto.descricao());
        tarefa.setStatus(dto.status());

        return tarefa;
    }

    public static TarefaResponseDto toResponse(Tarefa dto) {
        TarefaResponseDto tarefa = new TarefaResponseDto(
                dto.getId(),
                dto.getTitulo(),
                dto.getDescricao(),
                dto.getStatus()
        );

        return tarefa;
    }
}
