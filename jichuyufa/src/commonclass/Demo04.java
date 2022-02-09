package commonclass;

import java.util.Date;

/**
 * Date
 */
public class Demo04 {
    public static void main(String[] args) {
        //1.创建Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());//Tue Feb 08 23:50:00 CST 2022
        System.out.println(date1.toLocaleString());//2022-2-8 23:50:00
        //昨天
        Date date2 = new Date(date1.getTime()-60*60*24*1000);
        System.out.println(date2.toLocaleString());//2022-2-7 23:50:00
        //2.方法after,before
        boolean b1 = date1.after(date2);
        System.out.println(b1);//true
        boolean b2 = date1.before(date2);
        System.out.println(b2);//false

        //比较 compareTo() 0,1,-1
        int d = date1.compareTo(date2);
        System.out.println(d);//1
    }
}
