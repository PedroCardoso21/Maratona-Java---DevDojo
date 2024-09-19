package javacore.Jmodificadorfinal.test;

import javacore.Jmodificadorfinal.dominio.Carro;
import javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Ferrari ferrari = new Ferrari("Enzo");

        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR.getNome());
    }
}
