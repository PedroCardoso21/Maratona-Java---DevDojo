package Introducao;

public class aula04EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida alcoólica");
        }
        else{
            System.out.println("Não pode comprar bebida alcoólica");
        }
        //! Negação
        if(!isAutorizadoComprarBebida){
            System.out.println("Não pode comprar bebida alcoólica");
        }
    }
}
