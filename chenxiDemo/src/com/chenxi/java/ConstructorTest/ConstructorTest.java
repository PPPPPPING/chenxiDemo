package com.chenxi.java.ConstructorTest;

/**
 * 构造器:定义构造器的格式 权限修饰符 类名（形参列表）{  }
 * public Person(){  }
 * 1创建对象
 * 2初始化对象的信息
 * <p>
 * 一个类中定义多个构造器，构成重载
 */
public class ConstructorTest {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p);
        Person p1 = new Person(5);
        System.out.println(p1.age);

    }


}

class Person {

    //属性

    String name;
    String name2;
    int age;

    //构造器:定义构造器的格式 权限修饰符 类名（形参列表）{  }
    public Person() {
        System.out.println("Person()......");
    }

    public Person(int i) {
        this();
        age = i;
    }

    public Person(String m, int i) {
        this(i);
        name2 = m;

    }

    //方法
    public void eat() {
        System.out.println("人吃饭");
    }

    public void study() {
        System.out.println("人学习");
    }

}



