package com.chenxi.homework.db;


import com.chenxi.homework.pojo.MysqlDbUser;
import com.chenxi.homework.pojo.User;

import java.util.ArrayList;

public class MysqlDB extends AbstractDB{
    private final ArrayList<User> users = new ArrayList<>();
    MysqlDbUser admin = new MysqlDbUser(User.getTempId(),"admin","000","admin",16);
    MysqlDbUser user1 = new MysqlDbUser(1,"张三","000","张三",16);
    MysqlDbUser user2 = new MysqlDbUser(2,"李四","111","李四",16);


    /**
     * 连接数据库的方法
     * @param key 数据库端口号
     */
    public static MysqlDB conn(String key) {
        if ("3306".equals(key)){
            return new MysqlDB();
        }
        return null;
    }

    /**
     * 添加用户的方法
     * @param user 添加的用户
     * @return 添加用户后的集合
     */
    @Override
    public boolean create(User user) {
        return users.add(user);
    }

    /**
     * 更新用户的方法
     * @param user 更新的用户
     * @return 是否更新
     */
    @Override
    public boolean update(User user) {
        for (User userMysql : users){
            if (user.getId() == userMysql.getId()){
                users.set(userMysql.getId(), user);
                return true;
            }
        }
        return false;
    }

    /**
     * 根据用户名删除用户的方法
     * @param username 用户名
     * @return 删除指定用户后的集合
     */
    @Override
    public User deleteByUsername(String username) {
        for (User user : users){
            if (user.getUsername().equals(username)){
                users.remove(user);
                return user;
            }
        }
        return null;
    }

    /**
     * 根据用户id查询指定用户的方法
     * @param id 用户id
     * @return 指定用户信息
     */
    @Override
    public User viewByKey(int id) {
        for (User userMysql : users) {
            if (id == userMysql.getId()) {
                return userMysql;
            }
        }
        return null;
    }

    /**
     * 根据用户名查询指定用户信息的方法
     * @param username 用户名
     * @return 指定用户信息
     */
    @Override
    public User viewByUsername(String username) {
        for (User user : users){
            if (user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    /**
     * 查询所有用户信息的方法
     * @return 所有用户信息
     */
    @Override
    public ArrayList<User> viewAll() {
        users.add(admin);
        users.add(user1);
        users.add(user2);
        return users;
    }

}
