package Introducao;

public class aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.50D;
        float salarioFloat = (float) 250.50D;
        byte idadeByte = 20;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;
        String nome = "Pedro Cardoso";

        System.out.println("A idade é "+idade+ " anos");
        System.out.println(caractere);
        System.out.println("Meu nome é "+nome);
    }
}
