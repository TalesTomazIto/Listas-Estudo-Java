package solutis.elasticcode.locadora_filmes.controller.filmeDto;

import jakarta.validation.constraints.NotBlank;

public record FilmeRequestDto(@NotBlank String titulo, @NotBlank String genero, @NotBlank String diretor) {
}
