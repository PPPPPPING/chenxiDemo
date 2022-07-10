package com.chenxi.javateat.ListTest.List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * list接口  存储有序的，可复用的数据  动态数组 替换原有的数组
 * arraylist 作为list接口的主要实现类
 * <p>
 * list接口常用方法
 */
public class ListTest {
    @Test
    public void test2() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(456);
        int index = list.indexOf(456);
        System.out.println(index);

        //
        System.out.println(list.lastIndexOf(456));
    }


    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");

        list.add(456);

        System.out.println(list);

        //void add(int index,object ele):在index位置插入ele元素
        list.add(1, "BB");
        System.out.println(list);


        List list1 = Arrays.asList(1, 2, 3);

        list.addAll(list1);
        System.out.println(list.size());

        System.out.println(list.get(0));

    }

}

