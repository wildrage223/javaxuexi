package collection.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Set;

/**
 * Properties的使用
 */
public class Demo01 {
    public static void main(String[] args) throws Exception{
        // 1 创建集合
        Properties properties = new Properties();

        // 2 添加数据
        properties.setProperty("username", "wyf");
        properties.setProperty("age", "27");
        System.out.println(properties.toString()); //{age=27, username=wyf}

        // 3 遍历
        // 3.1 keyset
        //3.2 entryset
        //3.3 stringPropertyNames()
        Set<String> pronames = properties.stringPropertyNames();
        for (String proname: pronames) {
            System.out.println(proname + "====" + properties.getProperty(proname));
        }

        //4和流有关的方法
        //--------------list方法-----------
        PrintWriter pw = new PrintWriter("d:\\test\\print.txt");
        properties.list(pw);
        pw.close();

        // store方法保存
        FileOutputStream fos = new FileOutputStream("d:\\test\\store.properties");
        properties.store(fos, "注释");
        fos.close();

        //load方法加载
        Properties properties2 = new Properties();
        FileInputStream fis = new FileInputStream("d:\\test\\store.properties");
        properties2.load(fis);
        fis.close();
        System.out.println(properties2.toString());
    }
}
