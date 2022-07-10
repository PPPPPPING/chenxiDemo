package com.chenxi.javateat.CommonTest;

import java.util.Scanner;

public class ScoreGrade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生个数");
		int number = scan.nextInt();
		int[] score = new int[number];
		System.out.println("请输入"+number+"个学生成绩");
		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
			
		}
		int maxScore = 0;
		for (int i = 0; i < score.length; i++) {
			if (maxScore <= score[i]) {
				maxScore = score[i];

			}

		}
		char level;
		for (int i = 0; i < score.length; i++) {
			if (maxScore - score[i] <= 10) {
				level = 'A';
				
			}else if(maxScore - score[i] <= 20){
				level = 'B';
				
			}else if(maxScore - score[i] <= 30){
				level = 'C';
				
			}else {
				level = 'D';
			}
			System.out.println("最高成绩为"+maxScore+"等级"+level+"的成绩为"+score[i]);
			
		}
	}
}
