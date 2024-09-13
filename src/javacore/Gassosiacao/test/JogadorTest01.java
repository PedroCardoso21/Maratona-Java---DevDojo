package javacore.Gassosiacao.test;

import javacore.Gassosiacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Arrascaeta");
        Jogador jogador2 = new Jogador("Luiz Araujo");
        Jogador jogador3 = new Jogador("Pedro");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
