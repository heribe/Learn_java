package javaclass.manager;
/* created at 19:43 2017/11/3  */

public class DBManager implements IDBAction{
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }
}
