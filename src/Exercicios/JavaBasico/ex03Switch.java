package Exercicios;

public class ex03Switch {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou fim de semana
        // Considerando 1 como Domingo
        byte dia = 1;
        String diaUtil = "Dia útil";
        String fimDeSemana = "Fim de semana";

        switch (dia) {
            case 1:
                System.out.println(fimDeSemana);
                break;
            case 2:
                System.out.println(diaUtil);;
                break;
            case 3:
                System.out.println(diaUtil);;
                break;
            case 4:
                System.out.println(diaUtil);;
                break;
            case 5:
                System.out.println(diaUtil);;
                break;
            case 6:
                System.out.println(diaUtil);;
                break;
            case 7:
                System.out.println(fimDeSemana);;
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
