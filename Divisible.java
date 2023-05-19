package com.onesoft.day6_for;

public class Divisible {
	public static void main(String[] args) {
		for(int i=50;i<=250;i++) {
			if(i%2==0&&i%3==0) {
				System.out.println(i+" is divisible by both");
			}
			else {
				System.out.println(i+" is not divisible by both");
			}
		}
	}

}
