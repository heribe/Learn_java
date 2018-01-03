package javaclass.openfiles;

import java.util.ArrayList;
import java.util.List;

public class LoadManager {

    private List<Files> files = new ArrayList<>();

    public List<Files> getFiles(){
        return this.files;
    }

    public void loadFiles(Files file){
        this.files.add(file);
    }

    public void openFiles(){
        for (Files file: files) {
            file.open();
        }
    }

    public void openFile(Files file) {
        file.open();
    }
}
