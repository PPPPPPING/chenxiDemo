package com.chenxi.homework.db;



import com.chenxi.homework.pojo.User;

import java.util.ArrayList;

public interface ConnDB<E extends User> {
    // 数据库链接
    static ConnDB conn(String key) {
        return null;
    }

    // 增加
    boolean create(E e);
    // 修改
    boolean update(E e);
    // 删除
    E deleteByUsername(String username);
    // 查询
    E viewByKey(int id);
    E viewByUsername(String username);
    ArrayList<E> viewAll();
}
