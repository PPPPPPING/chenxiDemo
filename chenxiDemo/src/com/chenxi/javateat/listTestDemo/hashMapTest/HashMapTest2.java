package com.chenxi.javateat.listTestDemo.hashMapTest;

/**
 * HashMap获取值！
 */

import java.util.*;

public class HashMapTest2 {
    public static void main(String[] args) {

        //HashMap
        Map<String, Integer> hashMap = new IdentityHashMap<String, Integer>();
        for (int i = 0; i < 5; i++) {
            hashMap.put(new String( "name"), i);
            hashMap.put(new String( "children"), i);
        }
        Set<Map.Entry<String,Integer>> set = hashMap.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = set.iterator();


//        根据hashMap.entrySet()获取值
//        Set<Map.Entry<Integer, String>> set = hashMap.entrySet();
//        for (Map.Entry<Integer, String> entry : set) {
//            System.out.println(entry.getKey() + "   " + entry.getValue());
//        }
//
//        //通过keySet()获取key，再通过hashMap.get(key)获取value
//        Set<Integer> set1 = hashMap.keySet();
//        for (Integer integer : set1) {
//            System.out.println(integer + "   " + hashMap.get(integer));
//        }
//
//        //values()取值
//        Collection<String> collection = hashMap.values();
//        for (String string : collection) {
//            System.out.println(string);
//        }
//
//        Map<Integer, String> hashMap2 = new HashMap<Integer, String>();
//        for (int i = 0; i < 5; i++) {
//            hashMap2.put(i, "num");
//        }
//        //根据hashMap.entrySet()获取值
//        Set<Map.Entry<Integer, String>> set2 = hashMap2.entrySet();
//        for (Map.Entry<Integer, String> entry : set2) {
//            System.out.println(entry.getValue() + "   " + entry.getKey());
//        }
    }
}

