package javaclass.openfiles;

public class Test{

    public static void main(String[] args) {
        LoadManager loadManager = new LoadManager();

        loadManager.loadFiles(new WordFiles());

        loadManager.openFiles();
    }
}
