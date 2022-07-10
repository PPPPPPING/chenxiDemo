package com.chenxi.javateat;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author chenxi
 * @create 2022/6/27 19:39
 */
public class ShouldBuy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int amount = Integer.parseInt(input.nextLine());
        String price = input.nextLine();
        String[] priceArray = price.split(" ");
        int[] arrs = new int[priceArray.length];

        for (int i = 0; i < priceArray.length; i++) {
            arrs[i] = Integer.parseInt(priceArray[i]);
        }
        for (int i = 0; i < arrs.length - 1; i++) {
            for (int j = 0; j < arrs.length - 1; j++) {
                if (arrs[j] > arrs[j + 1]) {
                    int team = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] = team;
                }
            }
        }
        int totalAmount = 0;
        for (int arr : arrs) {
            totalAmount += arr;
            if (totalAmount > amount) {
                totalAmount = totalAmount - arr;
            }
        }
        System.out.println(totalAmount);
    }
}
