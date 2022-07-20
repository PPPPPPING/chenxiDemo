package com.chenxi.huawei;

/**
 * @Author cxi
 * @Date 2022/7/12 15:15
 */
public class ObjectTest {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("Tom",18);
        System.out.println(objectTest.toString());
    }

    private String name;
    private int age;
    public ObjectTest(String name, int age) {
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
    public ObjectTest() {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class ZiClone extends ObjectTest implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}




class Demo {
    public static void main(String[] args) throws Throwable {
        System.out.println("------Class getClass()----");
        ObjectTest stu1 = new ObjectTest("qw", 12);
        ObjectTest stu2 = new ObjectTest("ae", 12);
        Class aClass = stu1.getClass();
        Class aClass1 = stu2.getClass();
        //同种类型的对象，对应的字节码对象都是同一个
        //true
        System.out.println(aClass == aClass1);
        System.out.println(aClass);
        System.out.println(aClass1);



        ZiClone zi = new ZiClone();
        /*深克隆复制是对象 */
        zi.setName("lucy");
        //多态
        Object clone= zi.clone();
        ZiClone clone1=(ZiClone)clone;
        //==对比是时地址值
        //false
        System.out.println(zi==clone1);
        //复制出来的在堆中的内存位置不一样

        /*浅克隆  复制引用*/
        ZiClone  clone2=zi;
        //true
        System.out.println(zi==clone2);
    }
}
