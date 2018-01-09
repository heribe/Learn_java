package head.first.java;
/* created at 3:46 PM 1/8/2018  */
/*     Calendar     */

import java.util.Calendar;
import java.util.Date;

public class AboutCalendar {
    public static void main(String[] args) {
//        System.out.println(new Date()); //get the time
        Calendar cal = Calendar.getInstance(); //取得Calender一个子类的实例

        cal.set(2004,1,7,15,40);//设定时间
        long day1 = cal.getTimeInMillis(); //将目前时间转换为millisecond表示
        System.out.println(day1);
        cal.setTimeInMillis(day1); //用millisecond方式设置时间
        cal.add(cal.DATE, 35); //加上35天
        cal.roll(cal.DATE, 35); //滚动35天，注意：只有日会滚动，月份不会变
        cal.set(cal.DATE, 1); //直接设置DATE的值
    }
}
