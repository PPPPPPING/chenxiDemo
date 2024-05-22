package common;

import java.util.Arrays;

/**
 * @Author ping
 * @Date 2023/1/31 0:48
 */
public class TenMTest {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            tenM(5);
            tenM(2);
            System.out.println();
        }
    }

    public static void tenM(int n) {
        //创建一个数组
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
//        [x-y]区间的随机数
//        int num = (int) (Math.random() * (y - x + 1) + x);
        int index = 0;
        while (index < arr.length) {
            if (n == 5) {
                int num = (int) (Math.random() * 35 + 1);
                if (!contains(arr, num)) {
                    arr[index++] = num;
                }
            } else if (n == 2) {
                int num = (int) (Math.random() * 12 + 1);
                if (!contains(arr, num)) {
                    arr[index++] = num;
                }
            }
        }
        Arrays.sort(arr);
        //遍历输出
        if (n == 5) {
            System.out.print("front" + Arrays.toString(arr));
        } else if (n == 2) {
            System.out.println("back" + Arrays.toString(arr));
        }
    }

    //判断是否重复
    public static boolean contains(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

}
