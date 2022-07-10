package com.chenxi.javateat.CommonTest;
/*
求第几年的几月几号是该年的第几天 
*/
import java.util.Scanner;

public class howManyDays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = scan.nextInt();
		
		System.out.println("请输入第几月");
		int mouth = scan.nextInt();
		
		System.out.println("请输入第几日");
		int day = scan.nextInt();
		int sumdays = 0;
		switch (mouth) {
		case 12:
			sumdays += 30;
		case 11:
			sumdays += 31;
		case 10:
			sumdays += 30;
		case 9:
			sumdays += 31;
		case 8:
			sumdays += 31;
		case 7:
			sumdays += 30;
		case 6:
			sumdays += 31;
		case 5:
			sumdays += 30;
		case 4:
			sumdays += 31;
		case 3:
			if((year % 4 == 0 && year % 100 != 0) || (year%400 == 0)) {
				sumdays +=29;
			}else {
				sumdays += 28;
			}
		case 2:
			sumdays += 31;
		case 1:
			sumdays += day;
		}
		System.out.println(year+"年"+mouth+"月"+day+"日"+"是"+year+"年的第"+sumdays+"天");

	}

}

