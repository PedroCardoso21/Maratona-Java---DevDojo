package Exercicios;

public class ex02OperadoresCondicionais {
    public static void main(String[] args) {
        // Dado um determinado salário, qual o valor que eu tenho que pagar de imposto
        // 0 a 34.712 -> 9.7%
        // 34.713 a 68.507 -> 37.35%
        // > 68.508 -> 49,50%
        double salario = 70000;
        double imposto;

        if(salario > 0 && salario <= 34712){
            imposto = salario * 0.097;
            salario -= imposto;
        }
        else if (salario >= 34713 && salario <= 68507){
            imposto = salario * 0.3735;
            salario -= imposto;
        }
        else{
            imposto = salario * 0.495;
            salario -= imposto;
        }
        System.out.println("O seu salário com impostos foi de: "+salario);
    }
}
