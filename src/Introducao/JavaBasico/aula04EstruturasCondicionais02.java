package Introducao.JavaBasico;

public class aula04EstruturasCondicionais02 {
    public static void main(String[] args) {
        // Idade < 15 Infantil
        // Idade >= 15 < 18 Juvenil
        // Idade >= 18 Adulto
        int idade = 18;
        String categoria;

        if(idade < 15){
            categoria = "Infantil";
        }
        else if(idade >= 15 && idade < 18){
            categoria = "Juvenil";
        }
        else{
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}
