package com.chenxi.huawei;

import org.junit.Test;

import java.lang.reflect.Parameter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author cxi
 * @Date 2022/7/11 18:51
 */
public class StringTest {

    public static void main(String[] args) {

    }

    @Test
    public void URLTest() {
        //文本信息
        String content = "Linux，全称GNU/Linux，是一种免费使用和自由传播的类UNIX操作系统，" +
                "其内核由林纳斯·本纳第克特·托瓦兹于1991年10月5日首次发布，它主要受到Minix和Unix" +
                "思想的启发，是一个基于POSIX的多用户、多任务、支持多线程和多CPU的操作系统。它能运行" +
                "主要的Unix工具软件、应用程序和网络协议。它支持32位和64位硬件。Linux继承了Unix" +
                "以网络为核心的设计思想，是一个性能稳定的多用户网络操作系统。Linux有上百种不同的发行版，" +
                "如基于社区开发的debian、archlinux，和基于商业开发的" +
                "Red Hat Enterprise Linux、SUSE、Oracle Linux等。\n" +
                "2021年6月，根据Linux 5.14刚刚进入合并队列的char-misc-next提交，" +
                "Linux 5.14正式移除了RAW驱动";

        //找出其中的全部英语单词
        //找出百度热搜的标题：(///S*)
        //传统方法：使用遍历方式，代码量大，效率不高
        //正则表达式：
        /**
         * 1,先创建一个Pattern对象，模式对象，可以理解成一个正则表达式对象
         * 2,创建一个匹配器对象
         * 3,开始循环匹配
         */
        Pattern patter = Pattern.compile("([0-9]+)|([a-zA-Z]+)");
        //匹配数字时，[0-9]
        //数字+英文单词 ([0-9]+)|([a-zA-Z]+)
        //按照patter（模式/样式）。到content文本中匹配，找到true。否false
        Matcher matcher = patter.matcher(content);
        while (matcher.find()) {
            //匹配内容，文本放到matcher.group(); 中
            System.out.println("找到：" + matcher.group(0));
        }

        /*
        java中对url校验的正则表达式如下：

String regex = "(ht|f)tp(s?)\\:\\/\\/[0-9a-zA-Z]([-.\\w]*[0-9a-zA-Z])*(:(0-9)*)*(\\/?)([a-zA-Z0-9\\-\\.\\?\\,\\'\\/\\\\&%\\+\\$#_=]*)?";



这里的“\\\\”四个斜杠，被解释后实际上是一个斜杠。

java将“\\”解析为“\”
所以“\\\\”，java将会解析为“\\”交给正则表达式
 正则表达式再经过一次转换，把\\转换成为\
所以，java里面要用正则来表示一个\，　必须写成4个\ 。如果要表示\\，那就要写8个\
         */
        String regex = "(ht|f)tp(s?)\\:\\/\\/[0-9a-zA-Z]([-.\\w]*[0-9a-zA-Z])*(:(0-9)*)*(\\/?)([a-zA-Z0-9\\-\\.\\?\\,\\'\\/\\\\&%\\+\\$#_=]*)?";
        String baidu = "http://www.baidu.com";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(baidu.trim());
        boolean result = mat.matches();
        System.out.println(result);
    }

    @Test
    public void URLTest1() {
        String contents = "https://www.baidu.com";
        Pattern WEB_URL = Pattern.compile("(ht|f)tp(s?)\\:\\/\\/[0-9a-zA-Z]([-.\\w]*[0-9a-zA-Z])*(:(0-9)*)*(\\/?)([a-zA-Z0-9\\-\\.\\?\\,\\'\\/\\\\&%\\+\\$#_=]*)?");
        Matcher matcher2 = WEB_URL.matcher(contents);
        while (matcher2.find()) {
            System.out.println(matcher2.group(0));
        }
    }

    @Test
    public void founction() {
        String str = "ChenxiWangying";
        //3.charAt(int index)从字符中取出指定索引的值
        System.out.println(str.charAt(3));
        //4.indexOf(String str)方法,查找对应字符在字符串中的索引位置，如果没有则返回-1，常与3配合使用，
        System.out.println(str.indexOf("i"));
        //lastIndexOf(String str)方法，查找对应字符最后在字符串中出现的索引位置，如果没有则返回-1
        System.out.println(str.lastIndexOf("i"));

        //toCharArray()方法，将字符串变成一个数组
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println(Arrays.toString(charArray));

        //toUpperCase()将字符串全部转换为大写
        String strBig = str.toUpperCase();
        System.out.println(strBig);

        //8.toLowerCase()将字符串全部转换为小写
        String strSmall = str.toLowerCase();
        System.out.println(strSmall);

        //split("字符")，根据给定的正则表达式来拆分字符串，形成一个String数组
        String[] strArray = str.split("");
        System.out.println(Arrays.toString(strArray));

        //trim()方法，去除字符串左右两端的空白，该方法只能去除左右，中间的没办法
        String strSpaces = "  Chenxi Wangying  ";
        System.out.println(strSpaces.trim());

        //11.substring(int beginIndex,int endIndex)截取字符串
        System.out.println(str.substring(1, 3));
        System.out.println(str.substring(4));

        //12.equalsIgnoreCase(String str),忽略字符串大小比较字符串的值，
        String strA = "absC";
        String strB = "absc";
        System.out.println(strA.equalsIgnoreCase(strB));

        // concat(String str),将str的字符串的内容添加到字符串的后面，效果等同于+
        System.out.println(str.concat("addTest"));

        //replace(char oldChar,char newChar),该方法用字符newChar替换掉当前字符串中所有的oldChar。
        System.out.println(str.replace("i", "???"));

        //replaceFirst(String regex,String replacement),该方法用字符replacement替换掉当前字符串中第一个匹配regex。
        System.out.println(str.replaceFirst("h", "???"));

        //17.startsWith(String prefix)，比较该字符串是否以prefix子字符串开始的
        System.out.println(str.startsWith("Chen"));
        System.out.println(str.startsWith("chen"));

        //endsWith(String prefix)，比较该字符串是否以prefix结尾的
        System.out.println(str.endsWith("ing"));

        //19.valueOf(Type type)用于将基本数据类型转换为String类型，补充一点，type不能为null，不然会报空指针异常
        String strType = String.valueOf(21);
        System.out.println(strType);

        //20.getBytes()，将该字符串转换为字节数组
        String strByte = "123421421";
        byte[] bytes = strByte.getBytes();
        System.out.println(Arrays.toString(bytes));

        //21.String.format()方法，字符串类型格式话
        //format(String format,Object obj)，新字符串使用本地语言环境，制定字符串格式和参数生成格式的新字符串
        //format(Locale locale,String format,Object obj),使用指定语言环境，制定字符串格式和参数生成格式的新字符串

        Date date = new Date();
        //c的使用
        System.out.printf("全部日期和时间信息：%tc%n", date);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n", date);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n", date);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR", date);

    }

}


