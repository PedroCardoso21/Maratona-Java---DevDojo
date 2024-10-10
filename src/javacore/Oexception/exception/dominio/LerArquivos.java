package javacore.Oexception.exception.dominio;

public class LerArquivos implements AutoCloseable{
    public LerArquivos() {

    }

    public void ler() {
        System.out.println("Leitura de arquivo");
        throw new RuntimeException("erro");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Fechando o Arquivo");
    }
}
