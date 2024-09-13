package javacore.Gassosiacao.test;

import javacore.Gassosiacao.dominio.Jogador;
import javacore.Gassosiacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pedro");
        Jogador jogador2 = new Jogador("Cafu");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprime();

        System.out.println("--- Time ---");

        time.imprimir();
    }
}
