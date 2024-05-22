package common;


import java.util.Scanner;

/**
 * @Author cxi
 * @Date 2022/7/17 15:07
 */
public class HCON2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String str = in.next();
        double sum = 0.0;
        for (int i = 0; i < str.length(); i++) {
            sum += HCONsum(CHONnum(str.charAt(i)), i, str);
        }
        System.out.println(sum);
    }

    private static double HCONsum(double d, int i, String str) {
        // TODO Auto-generated method stub
        int k = 0;
        double sum = 0.0;
        while (i < str.length() - 1 && str.charAt(i + 1) > '0' && str.charAt(i + 1) <= '9') {
            k = k * 10 + str.charAt(i + 1) - '0';
            i++;
        }
        if (k == 0) {
            sum += d;
        } else {
            sum += d * k;
        }
        return sum;
    }

    private static double CHONnum(char CHONnum) {
        // TODO Auto-generated method stub
        switch (CHONnum) {
            case 'C':
                return 12.01;
            case 'H':
                return 1.008;
            case 'O':
                return 16.00;
            case 'N':
                return 14.01;
        }
        return 0;
    }


}
