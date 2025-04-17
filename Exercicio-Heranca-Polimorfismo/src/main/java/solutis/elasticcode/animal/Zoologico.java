package solutis.elasticcode.animal;

public class Zoologico {
    Animal[] jaula;

    public void verAnimais(Animal[] jaula) {
        for (int i = 0; i < jaula.length; i++) {
            jaula[i].emitirSom();
            if (jaula[i] instanceof Cachorro) {
                ((Cachorro) jaula[i]).correr();
            } else if (jaula[i] instanceof Cavalo) {
                ((Cavalo) jaula[i]).correr();
            }
        }
    }
}
