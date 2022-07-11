package com.chenxi.java.CommonTest;

import java.util.Scanner;

public class bonus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入考试排名");
		int bonus = input.nextInt();
		System.out.println("请确认女朋友在不在家，在为1，不在为0");
		int GirlFriend = input.nextInt();
		boolean ok = (GirlFriend == 1?true:false);
		if(bonus <= 10) {
			if(ok) {
				System.out.println("一起出玩");
			}else {
				System.out.println("独自回家");
			}
			
		}
		if(bonus >10) {
			if(ok) {
				System.out.println("在家玩");
			}else {
				System.out.println("独自回家");
			}
		}
	}
}

