package solutis.elasticcode.animal;

public class Veterinario {
    public void examinar(Animal animal) {
        if (animal instanceof Cachorro) {
            System.out.println("O animal é um Cachorro!");
            animal.emitirSom();
        } else if (animal instanceof Cavalo) {
            System.out.println("O animal é um Cavalo!");
            animal.emitirSom();
        } else if (animal instanceof Preguica) {
            System.out.println("O animal é uma Preguiça!");
            animal.emitirSom();
        }
    }
}
