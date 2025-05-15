package solutis.elasticcode.desafio_locadora_carros.entity;

import jakarta.persistence.*;
import solutis.elasticcode.desafio_locadora_carros.entity.carro.Carro;
import solutis.elasticcode.desafio_locadora_carros.entity.pessoa.Motorista;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Aluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Calendar dataPedido;

    private Date dataEntrega;

    private Date dataDevolucao;

    private BigDecimal valorTotal;

    @ManyToOne
    private Motorista motorista;

    @OneToOne
    private ApoliceSeguro seguro;

    @ManyToOne
    private Carro carro;

    private Boolean carrinho;

    public Aluguel() {
    }

    public Aluguel(Calendar dataPedido, Date dataEntrega, Date dataDevolucao, BigDecimal valorTotal, Motorista motorista, ApoliceSeguro seguro, Carro carro, Boolean carrinho) {
        this.dataPedido = dataPedido;
        this.dataEntrega = dataEntrega;
        this.dataDevolucao = dataDevolucao;
        this.valorTotal = valorTotal;
        this.motorista = motorista;
        this.seguro = seguro;
        this.carro = carro;
        this.carrinho = carrinho;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Calendar dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Boolean getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Boolean carrinho) {
        this.carrinho = carrinho;
    }

    public ApoliceSeguro getSeguro() {
        return seguro;
    }

    public void setSeguro(ApoliceSeguro seguro) {
        this.seguro = seguro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
