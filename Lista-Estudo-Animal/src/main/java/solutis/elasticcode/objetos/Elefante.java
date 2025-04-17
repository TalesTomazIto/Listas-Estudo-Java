package solutis.elasticcode.objetos;

import solutis.elasticcode.abstratas.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB {
    @Override
    public void comer() {
        super.qtdComidaIngerida += 10;
        super.comer();
    }

    @Override
    public void dormir() {
        super.qtdHorasDormidas += 2;
        super.dormir();
    }

    @Override
    public void andar() {
        super.qtdKmsPercorridos += 8;
        super.andar();
    }
}
