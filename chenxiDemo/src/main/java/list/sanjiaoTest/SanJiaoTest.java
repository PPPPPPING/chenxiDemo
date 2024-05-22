package list.sanjiaoTest;

import java.util.Scanner;

public class SanJiaoTest {
    public static void main(String[] args) {
        System.out.println("请输入abc的值");
        Scanner sc = new Scanner(System.in);
        SanJiaoTest sanJiaoTest = new SanJiaoTest();
        sanJiaoTest.sanjiao(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    public void sanjiao(int a, int b, int c) {
        try {
            if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
                System.out.println("可以构成三角形");
                System.out.println("边长abc分别为：" + a + "|" + b + "|" + c);
            } else {
                try {
                    System.out.println(a + "|" + b + "|" + c+"不能构成三角形!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
