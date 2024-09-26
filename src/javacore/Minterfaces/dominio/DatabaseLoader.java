package javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }

    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retriveMaxDataSize na classe DatabaseLoader");
    }
}
