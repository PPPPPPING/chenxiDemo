package com.chenxi.javateat.ListTest.GenericParadigm;

/**
 * 泛型在集合中的使用
 */

import org.junit.Test;

import java.util.*;

public class GenericTest {

    @Test
    public void test2() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(78);
        list.add(55);
        list.add(67);
        list.add(99);
        //list.add("Tom");
//        for(Integer scare : list){
//            int stuScore = scare;
//            System.out.println(stuScore);
//        }
        //在集合中使用泛型的情况
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int stuScore = iterator.next();
            System.out.println(stuScore);
        }
    }


    @Test
    public void test3() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Tom", 87);
        map.put("jerry", 55);

        //泛型的嵌套
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> e = iterator.next();
            System.out.println( e.getKey() + "----" + e.getValue());

        }
    }
}
