package javacore.Dconstrutores.test;

import javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyu", "TV", 82, "Ação", "Konami");
        anime.imprime();
    }
}
