package common;

import java.util.Scanner;

/**
 * @Author cxi
 * @Date 2022/7/17 14:46
 * H1 C12 O:16 N14
 * 输入分子式，输出H2C13O9N12分子量
 */
public class HCON {
    //    public static void main(String[] args) {
//        sum("H2C13O9N12");
//   }
    public static void main(String[] args) {
        double[] massArr = new double[26];
        // C 的原子量
        massArr['C' - 'A'] = 12.01;
        // H 的原子量
        massArr['H' - 'A'] = 1.008;
        // O 的原子量
        massArr['O' - 'A'] = 16.00;
        // N 的原子量
        massArr['N' - 'A'] = 14.01;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            String str = input.next();
            //所求分子量
            double molarMass = 0;
            //原子对应的原子个数（字符串形式）
            String tempNum = "";
            //字符串的一个字符
            char tempChar;
            //原子个数
            int num = 1;

            //从字符串后面往前进行判断。先求出原子的个数，再找到原子个数前面所属的原子
            for (int j = str.length() - 1; j >= 0; j--) {
                tempChar = str.charAt(j);
                if (tempChar >= '0' && tempChar <= '9') {
                    tempNum = tempChar + tempNum;
                } else {
                    if (tempNum.equals("")) {
                        //只有一个原子
                        num = 1;
                    } else {
                        //得到原子数
                        num = Integer.parseInt(tempNum);
                        tempNum = "";
                    }

                    molarMass += massArr[tempChar - 'A'] * num;
                }
            }
            System.out.printf("%.3f\n", molarMass);
        }
    }
}

//    public static int sum(String str) {
//        Map<Character, Integer> map = new HashMap<>(4);
//        map.put('C', 12);
//        map.put('H', 1);
//        map.put('O', 16);
//        map.put('N', 14);
//
//        Set<Map.Entry<Character, Integer>> set = map.entrySet();
//        for (Map.Entry<Character, Integer> entry : set) {
//            System.out.println(entry.getValue() + "   " + entry.getKey());
//        }
//
//        String[] strArr = str.split("");
//        for (int i = 0; i < strArr.length; i++) {
//
//        }
//
//        return 0;
//    }
//}
