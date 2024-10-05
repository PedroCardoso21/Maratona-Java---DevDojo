package javacore.Npolimorfismo.Aprendendomais.dominio;

public class Pessoa {
    public static void falar(){
        System.out.println("Oii");
    }

    public void falar(String texto){
        System.out.println(texto);
    }

    public void falar(String texto, int quantidade) {
        System.out.println(texto + " " + quantidade);
    }

    public void falar(int quantidade) {
        System.out.println(quantidade);
    }
}
