package javaclass.manager;
/* created at 20:22 2017/11/3  */

import org.junit.Test;


public class test {
    @Test
    public void test(){
        System.out.println("esfgtwqer");
        String a = "123";
        if(a.equals(new DBClient().getPermission())){
            DBClient ab = new DBClient();
            ab.add();
            System.out.println("ewqer");
        }
    }
//    public static void main(String[] args) {
//
//        System.out.println("esfgtwqer");
//        String a = "123";
//        if(a.equals(new DBClient().getPermission())){
//            DBClient ab = new DBClient();
//            ab.add();
//            System.out.println("ewqer");
//        }
//    }

}
