package com.chenxi.javateat.bookAdd2;

import java.util.*;

/**
 * 定义图书类Book，具有属性账号id，书名name、作者author 和价格price，
 * 在创建图书对象时要求通过构造器进行创建，一次性将四个属性全部赋值，
 * 要求账户属性是int型，名称是String型，作者是String型，价格是double,
 * 请合理进行封装。
 * 2)在Book类，添加toString方法，要求返回 图书信息字符串，使用\t隔开各信息
 * 3)要求定义一个图书馆Library类，在图书馆类中添加一个HashSet集合用于保存多本图书
 * 4）在图书馆类中要求能够新增图书
 * 5）在图书馆类中要求可以查看所有添加过的图书
 * 6）不允许添加重复的图书（如果账号id和书名name相同，则认为两本书是相同的）
 */

public class Library {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        addTS();
    }

    //添加
    public static void addTS() {
        HashSet<Book> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("请输入账号id:");
            int id = scanner.nextInt();
            System.out.println("请输入图书名称：");
            String bookName = scanner.next();
            System.out.println("请输入作者：");
            String author = scanner.next();
            System.out.println("请输入图书价格：");
            double price = scanner.nextDouble();
            hashSet.add(new Book(id, bookName, author, price));
            System.out.println("是否继续，请输入（y/n）：");
            String string = scanner.next();
            if ("y".equals(string)) {
                System.out.println(hashSet);
            } else {
                System.out.println("查看图书");
                break;
            }

        } while (true);
        ArrayList<Book> arrayList = new ArrayList<>(hashSet);
        Collections.sort(arrayList);
        Iterator<Book> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book);
        }
    }

}
