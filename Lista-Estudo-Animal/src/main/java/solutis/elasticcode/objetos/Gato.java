package solutis.elasticcode.objetos;

import solutis.elasticcode.abstratas.AnimalTerrestreAB;

public class Gato extends AnimalTerrestreAB {
    @Override
    public void comer() {
        super.qtdComidaIngerida += 3;
        super.comer();
    }

    @Override
    public void dormir() {
        super.qtdHorasDormidas += 16;
        super.dormir();
    }

    @Override
    public void andar() {
        super.qtdKmsPercorridos += 6;
        super.andar();
    }
}
