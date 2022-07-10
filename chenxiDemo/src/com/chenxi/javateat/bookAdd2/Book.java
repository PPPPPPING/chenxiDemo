package com.chenxi.javateat.bookAdd2;

/**
 * * 定义图书类Book，具有属性账号id，书名name、作者author 和价格price，
 * * 在创建图书对象时要求通过构造器进行创建，一次性将四个属性全部赋值，
 * * 要求账户属性是int型，名称是String型，作者是String型，价格是double,
 * * 请合理进行封装。
 */

public class Book implements Comparable<Book>{

    private int id;
    private String bookName;
    private String author;
    private double price;

    public Book() {
        super();
    }

    public Book(int id, String bookName, String author, double price) {
        super();
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
        result = prime * result + id;
        return result;
    }


    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (bookName == null) {
            if (other.bookName != null)
                return false;
        } else if (!bookName.equals(other.bookName))
            return false;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Book [id=" + id +"\t"  + bookName + "\t" + author +"\t" + price + "]";
    }

    @Override
    public int compareTo(Book o) {
        // TODO Auto-generated method stub
        return this.getId()-o.getId();
    }

}

