package head.first.java;
/* created at 11:01 2017/11/5  */

import java.util.Calendar;
import java.util.Date;

public class Demo3 {


    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004,12,7,15,40);//settime
        System.out.println("set: " + c.getTime());
        long day1 = c.getTimeInMillis();//将时间转换为millisecond表示
        day1 += 1000*60*60;  //加小时
        c.setTimeInMillis(day1);
        System.out.println("new hour: " + c.get(c.HOUR_OF_DAY));
        c.add(c.DATE, 35); //加日期
        System.out.println("add 35 days: " + c.getTime());
        c.roll(c.DATE, 35); //滚动日期（不动月份）
        System.out.println("roll 35 days: " + c.getTime());
        c.set(c.DATE, 1); //设置DATE的值
        System.out.println("set to 1: " + c.getTime());
    }


}
