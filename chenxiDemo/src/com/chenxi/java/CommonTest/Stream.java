package com.chenxi.java.CommonTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author ping
 * @Date 2023/12/15 10:54
 */
public class Stream {

    public static void main(String[] args) {
        // 原始的List
//            List<String> names = new ArrayList<>("三", "李四哦", "王五王五", "赵六");
        List<String> names = new ArrayList<>();
        names.add("三三二三");
        names.add("李四哦");
        names.add("王五王五");
        names.add("赵六");
        names.add("七七八八九九");

        // 1. 将所有名字转换为大写
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("1. 将所有名字转换为大写: " + upperCaseNames);

        // 2. 只保留名字长度大于2的元素
        List<String> filteredNames = names.stream()
                .filter(name -> name.length() > 2)
                .collect(Collectors.toList());

        System.out.println("2. 只保留名字长度大于2的元素: " + filteredNames);

        // 3. 将所有名字连接成一个以逗号分隔的字符串
        String concatenatedNames = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println("3. 将所有名字连接成一个字符串: " + concatenatedNames);

        // 4. 计算名字列表的长度
        long namesLength = names.stream()
                .count();

        System.out.println("4. 计算名字列表的长度: " + namesLength);

        // 5. 对名字进行排序
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("5. 对名字进行排序: " + sortedNames);

        // 6. 转换为Map，以名字的长度作为key
        Map<Integer, List<String>> namesByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("6. 转换为Map，以名字的长度作为key: " + namesByLength);
    }
}

