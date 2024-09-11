package javacore.Csobrecargametodos.test;

import javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto", "TV", 82, "Ação");
        anime.imprime();
    }
}
