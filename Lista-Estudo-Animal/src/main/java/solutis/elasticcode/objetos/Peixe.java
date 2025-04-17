package solutis.elasticcode.objetos;

import solutis.elasticcode.abstratas.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {

    @Override
    public void comer() {
        super.qtdComidaIngerida += 1;
        super.comer();
    }

    @Override
    public void dormir() {
        super.qtdHorasDormidas += 7;
        super.dormir();
    }

    @Override
    public void nadar() {
        super.qtdKmsPercorridos += 60;
        super.nadar();
    }
}
