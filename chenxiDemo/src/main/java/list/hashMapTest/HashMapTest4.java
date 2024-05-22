package list.hashMapTest;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest4 {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            Integer value = hm.get(ch[i]);
            if (value != null) {
                count = value;
            }
            count++;
            hm.put(ch[i], count);
            count = 0;
        }

//        Set<Character> set1 = hm.keySet();
//        for (Character character : set1) {
//            System.out.print(character + "("+hm.get(character)+")");
//        }

        System.out.println();
        Set<Map.Entry<Character,Integer>> set = hm.entrySet();
        for (Map.Entry<Character,Integer> entry:set){
            System.out.println(entry.getKey()+"("+entry.getValue()+")");

        }
        }

    }

