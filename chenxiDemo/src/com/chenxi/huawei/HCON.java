package com.chenxi.huawei;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author cxi
 * @Date 2022/7/17 14:46
 * H1 C12 O:16 N14
 * 输入分子式，输出分子量
 */
public class HCON {
    public static void main(String[] args) {
        sum("HCON");
    }

    public static int sum(String str) {
        Map<Character, Integer> map = new HashMap<>(4);
        map.put('C', 12);
        map.put('H', 1);
        map.put('O', 16);
        map.put('N', 14);

        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> entry : set) {
            System.out.println(entry.getValue() + "   " + entry.getKey());
        }

        return 0;
    }
}
