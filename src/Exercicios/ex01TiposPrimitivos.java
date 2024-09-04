package Exercicios;
/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salario de <salario>, na data <data>
 */
public class ex01TiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Pedro Cardoso";
        String endereco = "Condomínio Vivendas";
        String dataRecebimento = "18/10/2004";
        double salario = 2300.75;

        System.out.println("Eu "+nome+", morando no endereço "+endereco+ ", confirmo que recebi o salario de "+salario+", na data " +dataRecebimento);
    }
}
