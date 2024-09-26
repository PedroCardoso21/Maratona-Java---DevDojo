package javacore.Minterfaces.test;

import javacore.Minterfaces.dominio.DataLoader;
import javacore.Minterfaces.dominio.DatabaseLoader;
import javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseloader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseloader.load();
        fileLoader.load();

        databaseloader.checkPermission();
        fileLoader.checkPermission();

        databaseloader.remove();
        fileLoader.remove();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
