package common;

import java.util.Scanner;

/**
 * @author chenxi
 * @date 2022/6/14 17:45
 */
public class FinalStringLength2 {
    public static void main(String[] args) {
        FinalStringLength2 finalStringLength2 = new FinalStringLength2();
        finalStringLength2.words();
    }

    public void words(){
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        System.out.println(strings[strings.length - 1].length());
    }
}
