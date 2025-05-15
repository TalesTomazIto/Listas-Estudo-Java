package solutis.elasticcode.desafio_locadora_carros.entity.pessoa;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Motorista extends Pessoa {

    private String cnh;

    public Motorista() {
    }

    public Motorista(String nome, String email, Date dtNascimento, String cpf, Sexo sexo, String cnh) {
        super(nome, email, dtNascimento, cpf, sexo);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    
}
