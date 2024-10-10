package javacore.Oexception.exception.test;

import javacore.Oexception.exception.dominio.LerArquivos;

public class TryWithResourcesTest02 {
    public static void main(String[] args) {
        try (LerArquivos lerArquivos = new LerArquivos()) {
            lerArquivos.ler();
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo");
        }
    }
}
