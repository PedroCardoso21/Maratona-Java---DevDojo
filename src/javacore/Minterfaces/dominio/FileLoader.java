package javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    public void load() {
        System.out.println("Carregando dados do arquivo");
    }

    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");
    }

    public void remove() {
        System.out.println("Removendo dados do arquivo");
    }
}
