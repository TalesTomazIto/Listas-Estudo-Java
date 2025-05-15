package solutis.elasticcode.desafio_locadora_carros.entity.carro;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String placa;

    private String chassi;

    private String cor;

    private BigDecimal valorDiaria;

    @ManyToMany
    private List<Acessorio> acessorio;

    @ManyToOne
    private ModeloCarro modeloCarro;

    public Carro() {
    }

    public Carro(String placa, String chassi, String cor, BigDecimal valorDiaria, List<Acessorio> acessorio, ModeloCarro modeloCarro) {
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.valorDiaria = valorDiaria;
        this.acessorio = acessorio;
        this.modeloCarro = modeloCarro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public BigDecimal getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(BigDecimal valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public List<Acessorio> getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(List<Acessorio> acessorio) {
        this.acessorio = acessorio;
    }

    public ModeloCarro getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(ModeloCarro modeloCarro) {
        this.modeloCarro = modeloCarro;
    }
}
