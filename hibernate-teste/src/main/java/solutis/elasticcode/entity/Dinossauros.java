package solutis.elasticcode.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dinossauros")
public class Dinossauros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name = "GENERO", nullable = false, length = 45, unique = false)
    private String genero;

    @Column
    private String especie;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Dinossauro{" +
                "id=" + codigo +
                ", especie='" + especie + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
