package solutis.elasticcode.desafio_locadora_carros.dto.motorista;

import solutis.elasticcode.desafio_locadora_carros.entity.pessoa.Sexo;

import java.util.Date;

public record MotoristaResponseDto(String nome, String email, Date dataNascimento, Sexo sexo, String cnh) {
}
