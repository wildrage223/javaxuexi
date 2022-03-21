package io.file;

import java.io.File;
import java.io.FileFilter;
import java.util.Date;

/**
 * File类的使用
 * （1）分隔符
 * （2）文件操作
 * （3）文件夹操作
 */
public class Demo01 {
    public static void main(String[] args) throws Exception{
//        seperator();
//        fileOpe();
        directoryOpe();
    }

    //（1）分隔符
    public static void seperator() {
        System.out.println("路径分隔符" + File.pathSeparator); //路径分隔符;
        System.out.println("名称分隔符" + File.separator);  //名称分隔符\
    }

    //（2）文件操作
    public static void fileOpe() throws Exception{
        //1创建文件
        File file = new File("d:\\test\\file.txt");
//        System.out.println(file.toString());//d:\test\file.txt
        if(!file.exists()) {
            boolean b = file.createNewFile();
            System.out.println("创建结果" + b); //已有就不会再创建
        }
        //2删除文件
        //2.1直接删除
//        System.out.println("删除结果" + file.delete());

        //2.2使用jvm退出时删除
//        file.deleteOnExit();
//        Thread.sleep(5000);

        //3获取文件信息
        System.out.println("获取文件的绝对路径：" + file.getAbsolutePath());//获取文件的绝对路径：d:\test\file.txt
        System.out.println("获取路径：" + file.getPath());  //获取路径：d:\test\file.txt
        System.out.println("获取文件名称" + file.getName()); //获取文件名称file.txt
        System.out.println("获取父目录：" + file.getParent()); //获取父目录：d:\test
        System.out.println("获取文件长度：" + file.length()); //获取文件长度：0
        System.out.println("文件创建时间：" + new Date(file.lastModified()).toString()); //文件创建时间：Mon Mar 21 21:46:30 CST 2022

        //4判断
        System.out.println("是否可写：" + file.canWrite());//是否可写：true
        System.out.println("是否是文件：" + file.isFile());//是否是文件：true
        System.out.println("是否隐藏：" + file.isHidden());//是否隐藏：false

    }

    //(3)文件夹操作
    public static void directoryOpe() throws Exception {
        //1创建文件夹
        File dir = new File("d:\\test\\dir");
        System.out.println(dir.toString());
        if(!dir.exists()) {
//            dir.mkdir(); //只能创建单级目录
            System.out.println("创建结果：" + dir.mkdirs()); //创建多级目录
        }
        //2删除文件夹
        // 2.1直接删除（只能删除空目录）
//        System.out.println("删除结果：" + dir.delete()); //删除最底层目录，且文件夹必须为空
        //2.2 使用jvm删除
//        dir.deleteOnExit();
//        Thread.sleep(5000);
        //3获取文件夹信息
        System.out.println("获取绝对路径：" + dir.getAbsolutePath());
        System.out.println("获取路径：" + dir.getPath());
        System.out.println("获取文件名称" + dir.getName());
        System.out.println("获取父目录：" + dir.getParent());
        System.out.println("文件创建时间：" + new Date(dir.lastModified()).toString());
        //4判断
        System.out.println("是否是文件夹：" + dir.isDirectory());//是否是文件：true
        System.out.println("是否隐藏：" + dir.isHidden());//是否隐藏：false

        //5遍历文件夹
        File dir2 = new File("d:\\");
        String[] strs = dir2.list();
        for (String str:strs) {
            System.out.println(str);
        }

        //FileFilter接口的使用
        File[] files = dir2.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.getName().indexOf("wendang") >= 0) {
                    return true;
                }
                return false;
            }
        });

        for (File file: files) {
            System.out.println(file.getName());
        }
    }
}
