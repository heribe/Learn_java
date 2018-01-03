package javaclass.openfiles;

public class WordFiles extends DocFiles {

    public WordFiles(){
        fileType = FileType.word;
    }

    @Override
    public void open() {
        System.out.println("open wordfile");
    }
}
