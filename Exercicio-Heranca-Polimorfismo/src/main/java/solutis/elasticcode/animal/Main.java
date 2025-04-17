package solutis.elasticcode.animal;

public class Main {
    public static void main(String[] args) {
        Animal animalGenerico = new Animal();
        Cachorro cachorro = new Cachorro();
        Cavalo cavalo = new Cavalo();
        Preguica preguica = new Preguica();


        animalGenerico.emitirSom();
        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();

        Veterinario veterinario = new Veterinario();

        Cachorro animalDesconhecido1 = new Cachorro();
        Cavalo animalDesconhecido2 = new Cavalo();
        Preguica animalDesconhecido3 = new Preguica();

        veterinario.examinar(animalDesconhecido1);
        veterinario.examinar(animalDesconhecido2);
        veterinario.examinar(animalDesconhecido3);
    }
}