package com.wyf.reflection;

/**
 * 类加载器
 */
public class ReflectionTest06 {
    public static void main(String[] args) throws ClassNotFoundException {

        // 获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader); //sun.misc.Launcher$AppClassLoader@b4aac2

        // 获取系统类加载器的父类加载器 --> 扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent); //sun.misc.Launcher$ExtClassLoader@140e19d

        // 获取扩展类加载器的父类加载器-->根加载器（C/C++）
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1); //null

        // 测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("com.wyf.reflection.ReflectionTest06").getClassLoader();
        System.out.println(classLoader); //sun.misc.Launcher$AppClassLoader@b4aac2

        // 测试JDK内置的类是谁加载的
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1); //null

        // 如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));

        // 双亲委派机制
            // java.lang.String --> 会往上找，找到上层以保证安全性

        /*
        D:\software\jdk\jdk1.8.0_92\jre\lib\charsets.jar;D:\software\jdk\jdk1.8.0_92\jre\lib\deploy.jar;D:\software\jdk\jdk1.8.0_92\jre\lib\ext\access-bridge-32.jar;
        D:\software\jdk\jdk1.8.0_92\jre\lib\ext\cldrdata.jar;D:\software\jdk\jdk1.8.0_92\jre\lib\ext\dnsns.jar;D:\software\jdk\jdk1.8.0_92\jre\lib\ext\jaccess.jar;
        D:\software\jdk\jdk1.8.0_92\jre\lib\ext\jfxrt.jar;D:\software\jdk\jdk1.8.0_92\jre\lib\ext\localedata.jar;D:\software\jdk\jdk1.8.0_92\jre\lib\ext\nashorn.jar;
        D:\software\jdk\jdk1.8.0_92\jre\lib\ext\sunec.jar;D:\software\jdk\jdk1.8.0_92\jre\lib\ext\sunjce_provider.jar;D:\software\jdk\jdk1.8.0_92\jre\lib\ext\sunmscapi.jar;
        D:\software\jdk\jdk1.8.0_92\jre\lib\ext\sunpkcs11.jar;D:\software\jdk\jdk1.8.0_92\jre\lib\ext\zipfs.jar;D:\software\jdk\jdk1.8.0_92\jre\lib\javaws.jar;
        D:\software\jdk\jdk1.8.0_92\jre\lib\jce.jar;D:\software\jdk\jdk1.8.0_92\jre\lib\jfr.jar;D:\software\jdk\jdk1.8.0_92\jre\lib\jfxswt.jar;
        D:\software\jdk\jdk1.8.0_92\jre\lib\jsse.jar;D:\software\jdk\jdk1.8.0_92\jre\lib\management-agent.jar;D:\software\jdk\jdk1.8.0_92\jre\lib\plugin.jar;
        D:\software\jdk\jdk1.8.0_92\jre\lib\resources.jar;D:\software\jdk\jdk1.8.0_92\jre\lib\rt.jar;D:\xuexigongzuo\xuexi\javaxuexi\thread\javaxuexi\out\production\javaxuexi;
        D:\xuexigongzuo\xuexi\javaxuexi\thread\javaxuexi\lib\commons-io-2.6.jar;D:\software\idea\ideainstall\IntelliJ IDEA 2021.1.1\lib\idea_rt.jar
         */
    }
}
