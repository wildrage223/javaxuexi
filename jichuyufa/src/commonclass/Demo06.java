package commonclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat
 */
public class Demo06 {
    public static void main(String[] args) throws ParseException {
        //1创建对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2创建Date
        Date date = new Date();
        //格式化date（把日期转换成字符串）
        String str = sdf.format(date);
        System.out.println(str);//2022-02-09 20:42:59
        //解析（把字符串转成日期）
        Date date2 = sdf.parse("2022-02-09 20:42:59");
        System.out.println(date2);//Wed Feb 09 20:42:59 CST 2022
    }
}
