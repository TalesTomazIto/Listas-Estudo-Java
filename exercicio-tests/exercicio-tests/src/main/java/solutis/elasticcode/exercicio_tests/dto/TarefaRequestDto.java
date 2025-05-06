package solutis.elasticcode.exercicio_tests.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import solutis.elasticcode.exercicio_tests.entity.TarefaStatus;

public record TarefaRequestDto(
        @NotBlank String titulo,
        @NotBlank String descricao,
        @Enumerated(EnumType.STRING) TarefaStatus status) {
}
