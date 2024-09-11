package Exercicios.JavaBasico;

public class ex05Break {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição -> Valor da parcela tem que ser maior ou igual a 1000
        double valorDoCarro = 96000;

        for(int parcela = 1; parcela <= valorDoCarro; parcela++){
            double valorParcela = valorDoCarro / parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("O carro pode ser parcelado em "+ parcela + " vezes");
        }
    }
}
