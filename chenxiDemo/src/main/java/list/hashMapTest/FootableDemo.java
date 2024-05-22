package list.hashMapTest;
/**
 * 将夺冠年份作为key值，冠名队名作为value值，存储至少三条数据到HashMap中，并循环打印输出。
 * 运行效果图：
 * 任务：
 * 1、将夺冠年份和冠军队名以key-value形式存储到HashMap中
 * 2、使用迭代器和EntrySet两种方式遍历输出HashMap中的key和value
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class FootballDemo {
    public static void main(String[] args) {
        //定义HashMap的对象并添加数据
        HashMap<Integer, String> hp = new HashMap<Integer, String>();
        hp.put(2006, "意大利");
        hp.put(2014, "德国");
        hp.put(2010, "西班牙");
        hp.put(2002, "巴西");
        hp.put(1998, "法国");

        //使用迭代器的方式遍历
//        Iterator<String> itF = hp.values().iterator();
//        Iterator<Integer> itF2 = hp.keySet().iterator();
//        while (itF.hasNext()) {
//            System.out.print(itF.next()+"  ");
//        }

        String a= hp.get(2006);
        System.out.println(a);


        System.out.println();
        //使用EntrySet同时获取key和value
        Set<Map.Entry<Integer, String>> entrySet = hp.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.print(entry.getKey() + "-");
            System.out.println(entry.getValue());
        }

    }
}

