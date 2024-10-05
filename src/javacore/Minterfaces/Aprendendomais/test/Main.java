package javacore.Minterfaces.Aprendendomais.test;

import javacore.Minterfaces.Aprendendomais.dominio.Cachorro;
import javacore.Minterfaces.Aprendendomais.dominio.Gato;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.fazerSom();
        cachorro.mover();
        gato.fazerSom();
        gato.mover();
    }
}
