package solutis.elasticcode.abstratas;

import solutis.elasticcode.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
    protected Integer qtdComidaIngerida;
    protected Integer qtdKmsPercorridos;
    protected Integer qtdHorasDormidas;

    @Override
    public void comer() {
        this.qtdComidaIngerida += qtdComidaIngerida;
    }

    @Override
    public void dormir() {
        this.qtdHorasDormidas += qtdHorasDormidas;
    }
}
