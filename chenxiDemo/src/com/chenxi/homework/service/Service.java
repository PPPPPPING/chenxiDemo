package com.chenxi.homework.service;


import com.chenxi.homework.dao.DBHandle;
import com.chenxi.homework.pojo.User;

import java.util.ArrayList;

public class Service {

    DBHandle dbHandle = new DBHandle();

    public String conn(String key) {
        return dbHandle.conn(key);
    }

    public User login(String username, String pwd){
        return dbHandle.login(username,pwd);
    }

    public ArrayList<User> selectAll(){
        return dbHandle.selectAll();
    }

    public boolean createMysql(String username, String password,String name, int age) {
        return dbHandle.createMysql(username, password, name, age);
    }

    public boolean createOracle(String username, String password,String name, String birthday) {
        return dbHandle.createOracle(username, password, name, birthday);
    }

    public boolean updateMysqlById(int id, String password, String name, int age){
        return dbHandle.updateMysqlById(id, password, name, age);
    }

    public boolean updateOracleById(int id, String password, String name, String birthday){
        return dbHandle.updateOracleById(id, password, name, birthday);
    }

    public User deleteByUsername(String username){
        return dbHandle.deleteByUsername(username);
    }

    public User viewByKey(int id) {
        return dbHandle.viewByKey(id);
    }

    public User viewByUsername(String username) {
        return dbHandle.viewByUsername(username);
    }

}
