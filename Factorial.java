package com.onesoft.day6_for;

public class Factorial {
	public static void main(String[] args) {
		int factorial=1;
		int num=Integer.parseInt("8");
		for(int i=num;i>=1;i--) {
			System.out.println(i);
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}

}
