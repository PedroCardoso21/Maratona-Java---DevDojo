package javacore.Minterfaces.Aprendendomais.dominio;

public class Gato implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato faz miau");
    }

    @Override
    public void mover() {
        System.out.println("O gato se move lentamente");
    }
}
