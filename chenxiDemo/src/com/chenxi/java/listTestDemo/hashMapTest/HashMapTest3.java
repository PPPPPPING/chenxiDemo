package com.chenxi.java.listTestDemo.hashMapTest;


import java.util.HashMap;

public class HashMapTest3 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        String[] strings = new String[]{"chenxi","chenxi2","chenxi2","chenxi"};
        hashMap.put("chenxi", 10);
        hashMap.put("chenxi2", 20);
        hashMap.put("chenxi3", 30);
        hashMap.put("chenxi", 10);
        System.out.println(hashMap);
        Integer vaule = hashMap.get(strings[3]);
        System.out.println(vaule);
    }


}
