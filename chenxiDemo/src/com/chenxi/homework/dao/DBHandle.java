package com.chenxi.homework.dao;



import com.chenxi.homework.db.MysqlDB;
import com.chenxi.homework.db.OracleDB;
import com.chenxi.homework.pojo.MysqlDbUser;
import com.chenxi.homework.pojo.OracleDbUser;
import com.chenxi.homework.pojo.User;

import java.util.ArrayList;

public class DBHandle {
    MysqlDB mysqlDB = new MysqlDB();
    ArrayList<User> usersOfMysql = mysqlDB.viewAll();
    OracleDB oracleDB = new OracleDB();
    ArrayList<User> usersOfOracle = oracleDB.viewAll();
    boolean change = true; //true代表使用的是Mysql数据库，false代表使用的是Oracle数据库

    /**
     * 连接数据库的方法
     * @param key 数据库端口号
     */
    public String conn(String key){
        if (MysqlDB.conn(key) != null){
            return "成功连接到Mysql数据库";
        }else if (OracleDB.conn(key) != null){
            change = false;
            return "成功连接到Oracle数据库";
        }else
            return null;
    }

    /**
     * 用户登陆的方法
     * @param username 用户名
     * @param pwd 密码
     * @return 使用的用户
     */
    public User login(String username, String pwd) {
        if (change){
            for (User user : usersOfMysql) {
                if (user.getUsername().equals(username) && user.getPassword().equals(pwd)) {
                    return user;
                }
            }
        }else {
            for (User user : usersOfOracle){
                if (user.getUsername().equals(username) && user.getPassword().equals(pwd)) {
                    return user;
                }
            }
        }
        return null;
    }

    /**
     * 查询所有用户信息的方法
     * @return 所有用户信息
     */
    public ArrayList<User> selectAll(){
        if (change){
            return usersOfMysql;
        }else {
            return usersOfOracle;
        }
    }

    /**
     * Mysql数据库创建新用户的方法
     * @param username 用户名
     * @param password 密码
     * @param name 昵称
     * @param age 年龄
     * @return 是否成功
     */
    public boolean createMysql(String username, String password, String name, int age){
        int id = usersOfMysql.size();
        User newUser = new MysqlDbUser(id,username,password,name,age);
        return mysqlDB.create(newUser);
    }

    /**
     * Oracle数据库创建新用户的方法
     * @param username 用户名
     * @param password 密码
     * @param name 昵称
     * @param birthday 生日
     * @return 是否成功
     */
    public boolean createOracle(String username, String password, String name, String birthday){
        int id = usersOfOracle.size();
        User newUser = new OracleDbUser(id,username,password,name,birthday);
        return oracleDB.create(newUser);
    }

    /**
     * 更新Mysql数据库信息的方法
     * @param id id
     * @param password 密码
     * @param name 昵称
     * @param age 年龄
     * @return 是否成功
     */
    public boolean updateMysqlById(int id, String password, String name, int age) {
        if (change) {
            for (User user : usersOfMysql) {
                MysqlDbUser user1 = (MysqlDbUser) user;
                if (user1.getId() == id) {
                    user1.setPassword(password);
                    user1.setName(name);
                    user1.setAge(age);
                    return mysqlDB.update(user1);
                }
            }
        }
        return false;
    }

    /**
     * 更新Oracle数据库的方法
     * @param id id
     * @param password 密码
     * @param name 昵称
     * @param birthday 生日
     * @return 是否成功
     */
    public boolean updateOracleById(int id, String password, String name, String birthday) {
        if (!change) {
            for (User user : usersOfOracle) {
                OracleDbUser user1 = (OracleDbUser) user;
                if (user1.getId() == id) {
                    user1.setPassword(password);
                    user1.setName(name);
                    user1.setBirthday(birthday);
                    return oracleDB.update(user1);
                }
            }
        }
        return false;
    }

    /**
     * 根据用户名删除用户的方法
     * @param username 用户名
     * @return 删除的用户信息
     */
    public User deleteByUsername(String username) {
        if (change){
            return mysqlDB.deleteByUsername(username);
        }else
            return oracleDB.deleteByUsername(username);
    }

    /**
     * 根据用户id查询指定用户的方法
     * @param id id
     * @return 指定用户信息
     */
    public User viewByKey(int id) {
        if (change){
            return mysqlDB.viewByKey(id);
        }else
            return oracleDB.viewByKey(id);
    }

    /**
     * 根据用户名查询指定用户的方法
     * @param username 用户名
     * @return 指定用户信息
     */
    public User viewByUsername(String username) {
        if (change){
            return mysqlDB.viewByUsername(username);
        }else
            return oracleDB.viewByUsername(username);
    }


}
