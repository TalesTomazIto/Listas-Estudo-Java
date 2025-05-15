package solutis.elasticcode.desafio_locadora_carros.dto.funcionario;

import solutis.elasticcode.desafio_locadora_carros.entity.pessoa.Sexo;

import java.util.Date;

public record FuncionarioRequestDto(String nome, String email, Date dataNascimento, String cpf, Sexo sexo, String matricula) {}
