package com.chenxi.javateat.JavaBeen;

/**
 * JavaBeen：可重复用的组件
 */
public class Customer {
    private int id;
    private String name;

    //空参的构造器
    public Customer() {

    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
