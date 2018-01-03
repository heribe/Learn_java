package javaclass.animal;

public class Dog extends animal implements Pet{
    private int size;

    public Dog(){
        size = 14;
    }

    public int getSize() {
        System.out.println(size);
        return size;
    }

    public Dog(int size){
        this.size = size;
    }
    @Override
    public void showType() {

    }

    @Override
    public void play() {
        System.out.println("dog play");
    }

}
