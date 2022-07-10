package com.chenxi.homework.db;


import com.chenxi.homework.pojo.OracleDbUser;
import com.chenxi.homework.pojo.User;

import java.util.ArrayList;

public class OracleDB extends AbstractDB{
    private final ArrayList<User> users = new ArrayList<>();
    OracleDbUser admin = new OracleDbUser(User.getTempId(),"admin","000","admin","2000-01-24");
    OracleDbUser user1 = new OracleDbUser(1,"张三","000","张三","2000-06-01");
    OracleDbUser user2 = new OracleDbUser(2,"李四","111","李四","2000-10-01");


    /**
     * 连接数据库的方法
     * @param key 数据库端口号
     */
    public static OracleDB conn(String key) {
        if ("1521".equals(key)){
            return new OracleDB();
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
        for (User userOracle : users){
            if (user.getId() == userOracle.getId()){
                users.set(userOracle.getId(),user);
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
        for (User userOracle : users){
            if (id == userOracle.getId()){
                return userOracle;
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
