package com.corenetworks.pueba;

import com.corenetworks.modelo.Animal;

public class PruebaAnimal {
    public static void main(String[] args) {
        //crear 3 objetos de la clase animal con los nombres pez,perro,gato
        Animal pez = new Animal();
        pez.setCarnivoro(true);
        pez.setMamifero(false);
        pez.setColorPelaje("No tiene");
        System.out.println(pez.toString());
        System.out.println(pez.comer());
        System.out.println(pez.emitirSonido());
        Animal perro = new Animal(true,true,"Arena");
        System.out.println(perro.toString());
        System.out.println(perro.comer());
        System.out.println(perro.emitirSonido());
        Animal gato = new Animal(true,true,"blanco");
        System.out.println(gato.toString());
        System.out.println(gato.comer());
        System.out.println(gato.emitirSonido());

    }
}
