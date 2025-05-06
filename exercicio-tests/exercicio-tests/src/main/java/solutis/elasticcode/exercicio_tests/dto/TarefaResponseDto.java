package solutis.elasticcode.exercicio_tests.dto;

import solutis.elasticcode.exercicio_tests.entity.TarefaStatus;

public record TarefaResponseDto(Long id, String titulo, String descricao, TarefaStatus status) {
}
