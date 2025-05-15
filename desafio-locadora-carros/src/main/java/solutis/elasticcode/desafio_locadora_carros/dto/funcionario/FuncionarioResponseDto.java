package solutis.elasticcode.desafio_locadora_carros.dto.funcionario;

import solutis.elasticcode.desafio_locadora_carros.entity.pessoa.Sexo;

import java.util.Date;

public record FuncionarioResponseDto(String nome, String email, Date dataNascimento, Sexo sexo, String matricula) {
}
