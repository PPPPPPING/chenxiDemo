package list.arrayListTest;
/**
 * ArrayList的使用
 */

import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class ArrayList {
    public static void main(String[] args) {
        List<Student> list = new java.util.ArrayList<>();
        //添加元素到集合
        add(list);
        //遍历集合并打印
        ergodicPrint(list);
//        //修改年龄最大的学生姓名为葫芦娃
//        changeMaxAgeName(list);
    }

    public static void add(List<Student> list) {
        list.add(new Student(1, "陈玺", 80));
        list.add(new Student(2, "王赢", 90));
        list.add(new Student(3, "王大锤", 100));
    }

    public static void ergodicPrint(List<Student> list) {
        //遍历的第一中方法
        Iterator<Student> integer = list.iterator();
        while (integer.hasNext()) {
            System.out.println(integer.next());
            System.out.println("!!!!!!!!!!!!!!!!!!!");
        }
        //遍历的第二种方法
        integer = list.iterator();
        for (Student student : list) {
            System.out.println(integer.next());
        }


//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//
//        }
    }

    @Test
    public static void ergodicPrint2() {

    }

    private static void changeMaxAgeName(List<Student> list) {
        Optional<Student> op = list.stream().sorted((s1, s2) -> (int) (s2.getScore() - s1.getScore())).findFirst();
        Student student = op.get();
        student.setName("葫芦娃");
    }


}


