package com.chenxi.javateat.satic;

/**
 * static只能用来修饰属性 方法 代码块 内部类
 * <p>
 * 1修饰属性  静态变量，
 * 属性按是否使用static修饰  又分为静态属性 vs 动态熟悉（实例变量）
 * <p>
 * 属性：
 * 实例变量:我们创建了类的多个对象  每个对象都独立的拥有一套类中的非静态变量
 * 方修改其中的一个对象中的非静态属性是 不会导致其他对象的属性值的修改
 * 静态变量:  我们创建了类的多个对象  多个对象共享同一个静态变量  当通过某一个对象修改静态变量时  会导致
 * 其他对象调用此静态变量时  是修改过了的
 * <p>
 * static的其修饰属性他说明：
 * 随着类的加载而加载    可以通过 类.静态变量  的方式进行调用
 * 静态变量的加载要早于对象的创建
 * 由于类只会加载一次 则静态变量在内存中也只会尊在一次  存在方法去的静态域中
 *            类变量  实例变量
 *        类   yes     no
 *       对象  yes    yes
 * <p>
 * 2使用static修饰方法，静态方法
 * 随着类的加载而加载  可以通过  类.静态方法   进行调用
 *              静态方法  非静态方法
 *          类   yes     no
 *         对象  yes     yes
 * 静态方法中智能调用静态的方法或者属性
 * 非静态方法中  既可以调用非静态方法或者属性也可以调用静态方法或者属性
 * <p>
 *static注意点  不能使用  this和super
 * 关于静态属性和静态方法的使用  大家从生命周期的角度去理解
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;

        Chinese c2 = new Chinese();
        c2.name = "丁俊晖";
        c2.age = 30;
//我们创建了类的多个对象  多个对象共享同一个静态变量  当通过某一个对象修改静态变量时  会导致
// 其他对象调用此静态变量时  是修改过了的
        c1.nation = "CHN";
        System.out.println(c2.nation);
        Chinese.show();
        c1.eat();

    }
}

//中国人
class Chinese {
    String name;
    int age;

    static String nation;

    public void eat() {
        System.out.println("人吃");
        walk();
        System.out.println("nation:"+nation);
    }

    public static void show() {
        System.out.println("人秀");
        System.out.println(Chinese.nation);
        walk();
    }

    public void info(){
        System.out.println("");
    }

    public static void walk(){

    }
}