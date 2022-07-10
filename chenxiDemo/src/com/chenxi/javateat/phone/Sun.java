package com.chenxi.javateat.phone;

/**
 * 18451650716
 */
public class Sun {
    public static void main(String[] args) {
        Sun sun = new Sun();
        System.out.println("我的手机号是："+sun.phone());
    }

    public String phone(){
        int[] array = new int[]{4,1,6,5,0,7,8};
        int[] array2 = new int[]{1,6,0,3,1,2,3,4,5,1,2};
        String tel = "";
        for (int i = 0; i < array2.length; i++) {
            tel += array[array2[i]];
        }
        return tel;
    }

}
