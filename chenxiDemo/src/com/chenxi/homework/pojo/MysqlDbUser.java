package com.chenxi.homework.pojo;

import java.util.Objects;

public class MysqlDbUser extends User{
    private String name;
    private int age;

    public MysqlDbUser() {
    }

    public MysqlDbUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public MysqlDbUser(int id, String username, String password, String name, int age) {
        super(id, username, password);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MysqlDbUser that = (MysqlDbUser) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age);
    }

    @Override
    public String toString() {
        return "MysqlDbUser{" +
                "id=" + getId() +
                ", username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

