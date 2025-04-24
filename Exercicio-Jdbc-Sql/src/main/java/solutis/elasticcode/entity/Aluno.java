package solutis.elasticcode.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod_aluno;

    @Column
    private String nome;

    @Column
    private String matricula;

    @Column
    private int numdisciplinas;

    public Aluno() {
    }

    public Aluno(String nome, String matricula, int numdisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.numdisciplinas = numdisciplinas;
    }

    public int getCod_aluno() {
        return cod_aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumdisciplinas() {
        return numdisciplinas;
    }

    public void setNumdisciplinas(int numdisciplinas) {
        this.numdisciplinas = numdisciplinas;
    }
}
