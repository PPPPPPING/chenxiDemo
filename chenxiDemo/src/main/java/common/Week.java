package common;

import java.util.Scanner;

/**
 * @author chenxi
 * @date 2022/4/8 19:00
 */
public class Week {
    public static void main(String[] args) {
        Week week = new Week();
        Scanner scanner = new Scanner(System.in);

        week.Test1(scanner.nextInt());

    }
    public void Test1(int n){
        int week = 3 + n - (int)(n/7)*7;
        int week2 = 3+n%7;
        System.out.println("今天是星期3第"+n+"天后是星期"+week);
        System.out.println("今天是星期3第"+n+"天后是星期"+week2);

        int i = n % 7;
        System.out.println(i);
    }

}
