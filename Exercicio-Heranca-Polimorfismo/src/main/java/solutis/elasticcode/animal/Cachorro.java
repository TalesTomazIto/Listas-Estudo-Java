package solutis.elasticcode.animal;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("AU AU AU!");
    }

    public void correr() {
        System.out.println("Correndo");
    }
}
