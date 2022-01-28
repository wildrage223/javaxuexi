package oop.demo04;

//所有类都直接或间接继承Object
//父类
public class Person {

    private int money = 10_0000_0000;

    public void say() {
        System.out.println("说了一句话");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
