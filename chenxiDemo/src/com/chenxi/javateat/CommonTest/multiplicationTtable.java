package com.chenxi.javateat.CommonTest;
/*
九九乘法表 
*/

public class multiplicationTtable {

	public static void main(String[] args) {
		for(int i = 1 ;i <= 9;i++) {
			for(int j=1;j <=i;j++) {
				System.out.print(i+"乘"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}

	

}
}
