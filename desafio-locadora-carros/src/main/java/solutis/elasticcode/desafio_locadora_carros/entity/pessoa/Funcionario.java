package solutis.elasticcode.desafio_locadora_carros.entity.pessoa;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Funcionario extends Pessoa {

    private String matricula;

    public Funcionario() {
    }

    public Funcionario(String nome, String email, Date dtNascimento, String cpf, Sexo sexo, String matricula) {
        super(nome, email, dtNascimento, cpf, sexo);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
