package com.chenxi.homework.controller;


import com.chenxi.homework.pojo.User;
import com.chenxi.homework.service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner in = new Scanner(System.in);
    Service service = new Service();
    boolean mainRun = true; //所有程序
    boolean run = true; //登陆成功
    boolean run1 = true; //连接数据库
    boolean run2 = true; //登陆失败
    boolean database = true; // true是Mysql,false是Oracle

    public void run() {
        System.out.println("欢迎使用本系统!");
        while (mainRun) {
            while (run1) {
                conn();
            }
            login();
        }
    }

    public void conn() {
        System.out.println("请输入你要连接的数据库端口号(Mysql-->3306,Oracle-->1521):");
        String key = in.next();
        if (service.conn(key) != null) {
            System.out.println(service.conn(key));
            if ("成功连接到Oracle数据库".equals(service.conn(key))) {
                database = false;
            }
            run1 = false;
        } else
            System.out.println("你输入的数据库端口号有误,请重新输入!");
    }

    public void login() {
        System.out.println("请输入用户名:");
        String username = in.next();
        System.out.println("输入密码：");
        String pwd = in.next();
        User user = service.login(username, pwd);
        if (user != null) {
            System.out.println("登陆成功，欢迎" + user.getUsername());
            while (run) {
                System.out.println("=========================分割线=========================");
                System.out.println("1.查看信息  2.查看指定id的用户信息  3.查看指定用户名的用户信息");
                System.out.println("4.修改信息  5.注销用户  6.退出系统");
                String message = in.next();
                if ("1".equals(message)) {
                    selectAll();
                } else if ("2".equals(message)) {
                    viewByKey();
                } else if ("3".equals(message)) {
                    viewByUsername();
                } else if ("4".equals(message)) {
                    if (database) {
                        updateMysqlById();
                    } else
                        updateOracleById();
                } else if ("5".equals(message)) {
                    deleteByUsername();
                } else if ("6".equals(message)) {
                    run = false;
                    mainRun = false;
                } else
                    System.out.println("你输入的数据有误,请重新输入!");
            }
        } else {
            System.out.println("登陆失败！");
            while (run2) {
                System.out.println("1.注册用户");
                System.out.println("2.退出系统");
                String message = in.next();
                if ("1".equals(message)) {
                    if (database) {
                        createMysql();
                    } else
                        createOracle();
                    run2 = false;
                } else if ("2".equals(message)) {
                    run2 = false;
                    mainRun = false;
                } else
                    System.out.println("你输入的数据有误,请重新输入!");
            }
        }
    }

    public void selectAll() {
        ArrayList<User> users = service.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void createMysql() {
        System.out.println("请输入用户名:");
        String username = in.next();
        System.out.println("请输入密码:");
        String password = in.next();
        System.out.println("请输入昵称:");
        String name = in.next();
        System.out.println("请输入年龄:");
        int age = in.nextInt();
        if (service.createMysql(username, password, name, age)) {
            System.out.println("注册成功!");
        } else
            System.out.println("注册失败!");
    }

    public void createOracle() {
        System.out.println("请输入用户名:");
        String username = in.next();
        System.out.println("请输入密码:");
        String password = in.next();
        System.out.println("请输入昵称:");
        String name = in.next();
        System.out.println("请输入生日(格式为yyyy-MM-dd):");
        String birthday = in.next();
        if (service.createOracle(username, password, name, birthday)) {
            System.out.println("注册成功!");
        } else
            System.out.println("注册失败!");
    }

    public void updateMysqlById() {
        System.out.println("请输入你要更改的用户的id:");
        int id = in.nextInt();
        System.out.println("请输入更改后的密码:");
        String pwd = in.next();
        System.out.println("请输入更改后的昵称:");
        String name = in.next();
        System.out.println("请输入更改后的年龄:");
        int age = in.nextInt();
        if (service.updateMysqlById(id, pwd, name, age)) {
            System.out.println("修改成功!");
            selectAll();
        } else
            System.out.println("修改失败!");
    }

    public void updateOracleById() {
        System.out.println("请输入你要更改的用户的id:");
        int id = in.nextInt();
        System.out.println("请输入更改后的密码:");
        String pwd = in.next();
        System.out.println("请输入更改后的昵称:");
        String name = in.next();
        System.out.println("请输入更改后的生日:");
        String birthday = in.next();
        if (service.updateOracleById(id, pwd, name, birthday)) {
            System.out.println("修改成功!");
            selectAll();
        } else
            System.out.println("修改失败!");
    }

    public void deleteByUsername() {
        System.out.println("请输入你要注销的用户的用户名:");
        String username = in.next();
        User user = service.deleteByUsername(username);
        if (user != null) {
            System.out.println(user + "已被注销");
        } else
            System.out.println("注销失败!");
    }

    public void viewByKey() {
        System.out.println("请输入你要查询的用户的id:");
        int id = in.nextInt();
        User user = service.viewByKey(id);
        if (user != null) {
            System.out.println(user);
        } else
            System.out.println("查无此人!");
    }

    public void viewByUsername() {
        System.out.println("请输入你要查询的用户的用户名:");
        String username = in.next();
        User user = service.viewByUsername(username);
        if (user != null) {
            System.out.println(user);
        } else
            System.out.println("查无此人!");
    }

}
