package javacore.Qstrings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Pedro Cardoso";
        nome.concat(" DevDojo");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Pedro Cardoso");
        sb.append(" DevDojo").append(" Academy");
        System.out.println(sb);
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
