package com.chenxi.homework.pojo;

import java.time.LocalDate;
import java.util.Objects;

public class OracleDbUser extends User {
    private String name;
    private String birthday;//    "2022-03-11"

    private int getAge() {
        LocalDate today = LocalDate.now();
        return today.getYear() - Integer.getInteger(getBirthday().split("-")[0]);
    }

    public OracleDbUser() {
    }

    public OracleDbUser(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public OracleDbUser(int id, String username, String password, String name, String birthday) {
        super(id, username, password);
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OracleDbUser that = (OracleDbUser) o;
        return Objects.equals(name, that.name) && Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, birthday);
    }

    @Override
    public String toString() {
        return "OracleDbUser{" +
                "id=" + getId() +
                ", username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
