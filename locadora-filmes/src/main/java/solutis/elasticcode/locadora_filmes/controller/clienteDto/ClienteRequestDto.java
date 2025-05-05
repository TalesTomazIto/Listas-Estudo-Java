package solutis.elasticcode.locadora_filmes.controller.clienteDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ClienteRequestDto(@NotBlank String nome, @Email @NotBlank String email) {
}
