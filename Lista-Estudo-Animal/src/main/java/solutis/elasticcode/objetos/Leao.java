package solutis.elasticcode.objetos;


import solutis.elasticcode.abstratas.AnimalTerrestreAB;

public class Leao extends AnimalTerrestreAB {

    @Override
    public void comer() {
        super.qtdComidaIngerida += 10;
        super.comer();
    }

    @Override
    public void dormir() {
        super.qtdHorasDormidas += 17;
        super.dormir();
    }

    @Override
    public void andar() {
        super.qtdKmsPercorridos += 15;
        super.andar();
    }
}
