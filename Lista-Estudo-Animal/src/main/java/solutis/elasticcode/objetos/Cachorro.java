package solutis.elasticcode.objetos;

import solutis.elasticcode.abstratas.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {

    @Override
    public void comer() {
        super.qtdComidaIngerida += 5;
        super.comer();
    }

    @Override
    public void dormir() {
        super.qtdHorasDormidas += 12;
        super.dormir();
    }
    @Override
    public void andar() {
        super.qtdKmsPercorridos += 3;
        super.andar();
    }
}