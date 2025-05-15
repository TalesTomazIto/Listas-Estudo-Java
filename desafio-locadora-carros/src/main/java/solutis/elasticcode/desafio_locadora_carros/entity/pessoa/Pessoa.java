package solutis.elasticcode.desafio_locadora_carros.entity.pessoa;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.util.Date;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa {

    @Id
    private String id = UUID.randomUUID().toString();

    private String nome;

    @Email
    private String email;

    private Date dtNascimento;

    private String cpf;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, Date dtNascimento, String cpf, Sexo sexo) {
        this.nome = nome;
        this.email = email;
        this.dtNascimento = dtNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
