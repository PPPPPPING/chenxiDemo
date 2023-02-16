package com.chenxi.java.LeetCode;

/**
 * @Author ping
 * @Date 2022/10/12 16:13
 */
public class IftImpl implements InterFaceTest{
    @Override
    public void testA() {
        System.out.println(name);
    }

    String b = name;

    public static void main(String[] args) {
        IftImpl ift = new IftImpl();
        ift.testA();
        System.out.println(111111);
        int a = 128;
        int b = 128;
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);
        System.out.println(a == b );

    }

}


