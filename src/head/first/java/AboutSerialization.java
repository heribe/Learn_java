package head.first.java;
/* created at 1:35 PM 1/10/2018  */
/* Serializable 序列化储存与读取 */
import java.io.*;

public class AboutSerialization implements Serializable{
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //对对象进行序列化
    public static void SerializableDemo(AboutSerialization a, String fileName) {
        try {
            FileOutputStream fs = new FileOutputStream(fileName);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(a);
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //解序列化：还原对象
    public static AboutSerialization DeserializationDemo(String fileName) {
        AboutSerialization cc = null;
        try {
            FileInputStream fileStream = new FileInputStream(fileName);
            ObjectInputStream os = new ObjectInputStream(fileStream);
            Object one = os.readObject(); //读取对象。如果有多个对象，需要多行，并且读取顺序与写入顺序相同
            cc = (AboutSerialization) one; //返回的是object对象，需要转换类型
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return  cc;
    }

    public static void main(String[] args) {
        AboutSerialization mySe = new AboutSerialization();
        mySe.setWidth(50);
        mySe.setHeight(20);
        SerializableDemo(mySe, "foo.ser");
        AboutSerialization mySe2 = DeserializationDemo("foo.ser");
        System.out.println(mySe2.height+" "+mySe2.width);
    }

}
