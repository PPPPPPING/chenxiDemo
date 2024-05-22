package common;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author ping
 * @Date 2022/9/14 10:53
 */
public class Lambda {

    public static void main(String[] args) {
        String str = "";
        List<String> mylist = new ArrayList<>();
        mylist.add("cx");
        mylist.add("cx2");
        mylist.add("cx3");
        mylist.add("cx4");
        System.out.println("mylist:"+mylist);



        List<String> listLam = mylist.stream().map( i -> i+"?").collect(Collectors.toList());
        String strList = listLam.stream().map( i -> i.toString()).collect(Collectors.joining(","));
        str = MessageFormat.format("{0} {1}",strList,"王德法");
        System.out.println(listLam);
        System.out.println(strList);
        System.out.println(str);

        System.out.println(111111111);
        String strr = "chenxiwang";
//        strr = strr.substring(4);
        strr = strr.trim().substring(0,6);
        System.out.println(strr);


        StringBuffer sb = new StringBuffer("路飞");
        sb.append("fuck");
        System.out.println(sb);


    }

    public int test1(int a){

        return a;
    }

    public String test1(int b,int c){

        return "0";
    }

}
