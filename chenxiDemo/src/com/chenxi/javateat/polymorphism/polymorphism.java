package com.chenxi.javateat.polymorphism;

public class polymorphism {
    public static void main(String[] args) {
        polymorphism test = new polymorphism();
        test.func(new Dog());
        test.func(new Cat());

        Animal animal = new Cat();
        animal.eat();

        Animal animal1 = new Dog();
        animal1.shout();
    }

    public void func(Animal animal) {//声明了animal  Animal animal = new Animal();
        animal.eat();
        animal.shout();

    }

}

class Animal {


    public void eat() {
        System.out.println("动物吃");
    }

    public void shout() {
        System.out.println("动物叫");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃");
    }

    public void shout() {
        System.out.println("狗叫");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃");
    }

    public void shout() {
        System.out.println("猫叫");
    }
}
