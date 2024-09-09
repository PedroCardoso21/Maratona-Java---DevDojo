package Exercicios.OrientacaoObjetos.Test;

import Exercicios.OrientacaoObjetos.Dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Toyota Corolla";
        carro.ano =  2019;
        carro.modelo = "GLI";
        System.out.println("Carro 1 -> Nome: " + carro.nome + " Ano: " + carro.ano + " Modelo: " + carro.modelo);

        carro2.nome = "Fiat Cronos";
        carro2.ano =  2018;
        carro2.modelo = "Precision";
        System.out.println("Carro 2 -> Nome: " + carro2.nome + " Ano: " + carro2.ano + " Modelo: " + carro2.modelo);
    }
}
