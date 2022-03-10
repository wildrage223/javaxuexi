package collection.set;

import java.util.Objects;

/**
 * 人员类
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * 重写compareTo方法
     * @param o
     * @return
     */
    @Override
    public int compareTo(Person o) {

        //比姓名
        int n1 = this.getName().compareTo(o.getName());
        // 比年龄
        int n2 = this.age-o.getAge();

        return n1 == 0?n2:n1;
    }
}
