package com.chenxi.javateat.primenumber;

/**
 * @author chenxi
 * @date 2022/4/7 19:36
 * <p>
 * 求一百以内的质数
 */
public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println("一百以内的质数为：");
        primeNumber.primenumber();
    }

    public void primenumber() {
        boolean isTure = true;
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isTure = false;
                }
            }
            if (isTure == true) {
                System.out.print(i+" ");
            }
            isTure = true;
        }
    }

}
