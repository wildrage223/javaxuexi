package oop.demo03;

//private:私有
public class Student {
    //属性
    //名字
    private String name;
    //学号
    private int id;
    //性别
    private char sex;
    //年龄
    private int age;
    //封装一般对属性来说

    //提供一些public的get,set方法
    //get获取这个数据
    //set给这个数据设置值
    //alt + insert快速生成
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //内部封装，使不合法的去掉
        if(age > 120 || age < 0) {//不合法
            this.age = 3;
        }else {
            this.age = age;
        }
    }
    //学习（）

    //睡觉（）
}
