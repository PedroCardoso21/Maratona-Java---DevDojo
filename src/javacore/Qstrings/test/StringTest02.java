package javacore.Qstrings.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Lucas";
        String numeros = "012345";

        System.out.println(nome.equals(numeros)); // Compara os valores das strings
        System.out.println(nome.charAt(4)); // Retorna o valor baseado no índice
        System.out.println(nome.length()); // Retorna o tamanho da String
        System.out.println(nome.replace("a", "o")); // Troca os valores da String
        System.out.println(nome.toLowerCase()); // Transforma tudo em minúsculo
        System.out.println(nome.toUpperCase()); // Transforma tudo em maiúsculo
        System.out.println(numeros.substring(0,2)); // Retorna os valores do índice inicial até o final - 1
        System.out.println(nome.trim()); // Remove os valores em branco do início e do fim da String
    }
}
