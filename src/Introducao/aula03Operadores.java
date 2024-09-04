package Introducao;

public class aula03Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos
        // + - / * %
        int num1 = 10;
        int num2 = 20;
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int divisao = num2 / num1;
        int multiplicacao = num1 * num2;
        int resto = num1 % num2;
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(multiplicacao);
        System.out.println(resto);

        // Operadores Relacionais
        // > < >= <= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorqueVinte "+isDezMenorQueVinte);

        // Operadores Lógicos
        // && (AND) || (OR) ! (NOT
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 4612;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta );
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // Operadores de Atribuição
        // = += -+ *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 800
        bonus *= 2; // 3600
        bonus /= 2; // 900
        bonus %= 2; // 0
    }
}
