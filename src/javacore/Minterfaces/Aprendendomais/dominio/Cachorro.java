package javacore.Minterfaces.Aprendendomais.dominio;

public class Cachorro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz au au");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro se move rapidamente");
    }
}
