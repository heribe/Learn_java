package javaclass.manager;
/* created at 19:43 2017/11/3  */

public class DBManagerProxy implements IDBAction{
    private IDBAction dbAction;
    public DBManagerProxy(){
        dbAction = new DBManager();
    }

    public String getPermission(){
        String password = "123";
        return password;
    }


    public void add() {

        dbAction.add();
    }


    public void delete() {
        dbAction.delete();
    }


    public void update() {
        dbAction.update();
    }

}
