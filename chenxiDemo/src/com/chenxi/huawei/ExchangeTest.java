package com.chenxi.huawei;

public class ExchangeTest {
    public static void main(String[] args) {
        ExchangeTest exchangeTest = new ExchangeTest();
        exchangeTest.moveZeroes(new int[]{1, 0, 3, 3, 0, 0, 5, 4, 0, 3, 1, 2});
    }

    public static void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

    }

}
