package javacore.Oexception.exception.test;

import javacore.Oexception.exception.dominio.Leitor1;
import javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;
import java.net.ConnectException;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
        lerArquivo2();
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch(IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
