package common;


import java.util.Scanner;


/**
 * @author chenxi
 * @date 2022/6/14 15:14
 *
 * 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
 * 输入描述：
 * 输入一行，代表要计算的字符串，非空，长度小于5000。
 *
 * 输出描述：
 * 输出一个整数，表示输入字符串最后一个单词的长度。
 *
 * 示例1
 * 输入：
 * hello nowcoder
 * 复制
 * 输出：
 * 8
 * 复制
 * 说明：
 * 最后一个单词为nowcoder，长度为8
 *
 * next()方法只有扫描到有效字符后才会结束输入（用户没有输入的时候不会结束）；next()方法会自动去掉空白（例如回车、空格等），也不能得到带有空格的字符串；输入hello world，结果只会出来hello，空格以及后面的world会去除
 *
 * nextLine()方法可以直接使用回车结束输入。nextLine()方法可以得到空白和带有空格的字符串。
 */
public class FinalStringLength {
    public static void main(String[] args) {
        System.out.println("请输入字符串，用空格隔开：");
        Scanner scanner = new Scanner(System.in);
//        nextLine()方法可以直接使用回车结束输入。nextLine()方法可以得到空白和带有空格的字符串。
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        System.out.println("最后一个单词为"+strings[strings.length-1]+"，长度为："+strings[strings.length-1].length());

        stringLength();
    }

    public static void stringLength(){
        System.out.println("请输入字符串，用空格隔开：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.lastIndexOf(" "));
        int index = str.lastIndexOf(" ") + 1;
        System.out.println(str.length());
        System.out.println(str.length() - index);

    }

}
