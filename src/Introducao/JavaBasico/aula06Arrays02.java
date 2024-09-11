package Introducao.JavaBasico;

public class aula06Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        // char ' '
        // boolean false
        // String null

        byte[] idades = new byte[1];
        System.out.println("Tipos byte, short, int, long, float e double: "+idades[0]);

        char[] genero = new char[1];
        System.out.println("Tipo char: "+genero[0]);

        boolean[] teste = new boolean[1];
        System.out.println("Tipo boolean: "+teste[0]);

        String[] valor = new String[1];
        System.out.println("Tipo string: "+valor[0]);

        // Iteração de Arrays
        String[] nomes = new String[3];
        nomes[0] = "Joao";
        nomes[1] = "Mario";
        nomes[2] = "Pedro";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
