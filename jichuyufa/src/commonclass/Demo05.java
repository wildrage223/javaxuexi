package commonclass;

import java.util.Calendar;

/**
 * Calendar
 */
public class Demo05 {
    public static void main(String[] args) {
        //1.创建Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().toLocaleString());//2022-2-9 0:03:16
        System.out.println(calendar.getTimeInMillis());//1644336196299
        //2.读取时间信息
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);//0-11
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);//24小时
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(year + "-" + month+1 + "-" + day + " " + hour + ":" + minute + ":" + second);//2022-11-9 0:7:18

        //修改时间
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.DAY_OF_MONTH, 5);
        System.out.println(calendar2.getTime().toLocaleString());//2022-2-5 0:09:14

        //add添加或减少
        calendar2.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(calendar2.getTime().toLocaleString());//2022-2-4 0:09:14

        //补充,获取最大最小
        int max = calendar2.getActualMaximum(Calendar.DAY_OF_MONTH);
        int min = calendar2.getActualMinimum(Calendar.DAY_OF_MONTH);
        System.out.println(max);//28
        System.out.println(min);//1
    }
}
