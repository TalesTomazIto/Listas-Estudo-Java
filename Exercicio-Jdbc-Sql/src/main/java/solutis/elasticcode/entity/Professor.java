package solutis.elasticcode.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod_prof;

    @Column
    private String nome;

    @Column
    private String disciplina;

    @Column
    private int idade;

    public Professor() {
    }

    public Professor(String nome, String disciplina, int idade) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.idade = idade;
    }

    public int getCod_prof() {
        return cod_prof;
    }

    public void setCod_prof(int cod_prof) {
        this.cod_prof = cod_prof;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
