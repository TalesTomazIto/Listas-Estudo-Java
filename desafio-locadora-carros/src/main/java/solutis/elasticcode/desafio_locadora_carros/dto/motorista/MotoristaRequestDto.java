package solutis.elasticcode.desafio_locadora_carros.dto.motorista;

import solutis.elasticcode.desafio_locadora_carros.entity.pessoa.Sexo;

import java.util.Date;

public record MotoristaRequestDto(String nome, String email, Date dataNascimento, String cpf, Sexo sexo, String cnh) {}

