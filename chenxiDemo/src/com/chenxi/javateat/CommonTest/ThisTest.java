package com.chenxi.javateat.CommonTest;

/**
 * this调用构造器
 * super:父类的
 * 子类方法或者构造器中：super.方法  super.属性
 * super.属性：调用父类中声明的属性或者方法，一般习惯性省略
 * 但是子类属性与父类重名  不能省略
 * <p>
 * super.方法：调用父类中声明的属性或者方法，一般习惯性省略
 * 但是子类方法与父类重名  不能省略
 * <p>
 * 构造器同上
 */
public class ThisTest {
    private int id;
    private String name;

    //空参的构造器
    public ThisTest() {

    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    //    public void setName(String name){
//        //不能区分谁是属性谁是形参
//        name = name;
//    }
    public void setName(String name) {
        //前面的是属性，后面的形参
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
