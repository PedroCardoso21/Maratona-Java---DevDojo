package javacore.Gassosiacao.test;

import javacore.Gassosiacao.dominio.Jogador;
import javacore.Gassosiacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Léo Ortiz");
        Time time = new Time("Flamengo");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
