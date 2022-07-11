package com.chenxi.java.listTestDemo.hashSetTest;

import java.util.ArrayList;
import java.util.Collection;

public class ForTest {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("chenxi");
        collection.add("chenxi2");
        collection.add("chenxi3");
        collection.add("chenxi4");
        collection.add("chenxi2");
        collection.add("chenxi3");
        System.out.println("chenxi2"+"("+Test(collection,"chenxi2")+")");
    }

    public static int Test(Collection<String> collection, String s) {
        int num = 0;
        for (String s1:collection){
            if (s.equals(s1)){
                num++;
            }
        }
        return num;
    }


}
