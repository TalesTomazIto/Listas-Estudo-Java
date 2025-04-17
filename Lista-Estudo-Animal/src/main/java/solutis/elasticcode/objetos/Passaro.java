package solutis.elasticcode.objetos;

import solutis.elasticcode.abstratas.AnimalVoadorAB;

public class Passaro extends AnimalVoadorAB {
    @Override
    public void comer() {
        super.qtdComidaIngerida += 2;
        super.comer();
    }

    @Override
    public void dormir() {
        super.qtdHorasDormidas += 6;
        super.dormir();
    }

    @Override
    public void voar() {
        super.qtdKmsPercorridos += 42;
        super.voar();
    }
}
