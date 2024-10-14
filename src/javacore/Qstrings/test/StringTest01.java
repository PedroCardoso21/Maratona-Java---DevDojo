package javacore.Qstrings.test;

public class StringTest01 {
    public static void main(String[] args) {
        // Strings são imutáveis
        String nome = "Pedro"; // String constant Pool
        String nome2 = "Pedro";
        nome.concat(" Cardoso"); // Nome += " Cardoso"
        System.out.println(nome);
        nome = nome.concat(" Cardoso");
        System.out.println(nome);
        System.out.println(nome == nome2);
    }
}
