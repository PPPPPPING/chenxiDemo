package com.chenxi.java.CommonTest;

/*
 求100以内的质数 
 */

public class primeNumber {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i <= 10; i++) {
			boolean isflag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isflag = false;
				}
			}
			if (isflag == true) {
				System.out.println(i);
				sum += i;
			}
			
		}
		System.out.println(sum);

	}

}

