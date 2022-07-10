package com.chenxi.homework.db;


import com.chenxi.homework.pojo.User;

import java.util.ArrayList;

public abstract class AbstractDB implements ConnDB<User>{
    private final ArrayList<User> list = new ArrayList<>();

    public static AbstractDB conn(String key) {
        return null;
    }

    public AbstractDB() {

    }

    @Override
    public boolean create(User user) {
        return true;
    }
    @Override
    public boolean update(User user) {
        return true;
    }

    @Override
    public User deleteByUsername(String username) {
        return null;
    }

    @Override
    public User viewByKey(int id) {
        return null;
    }

    @Override
    public User viewByUsername(String username) {
        return null;
    }

    @Override
    public ArrayList<User> viewAll() {
        return null;
    }

}
