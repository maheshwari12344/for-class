package com.onesoft.day6_for;

public class UpperLower {
	public static void main(String[] args) {
		String a="MaHesWari";
		int upper=0;
		int lower=0;
		String b=a.toUpperCase();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b.charAt(i)) {//character we use equal equal... for string we use equals()
				upper++;
			}
			else {
				lower++;
			}
			//System.out.println(upper);
		}
		System.out.println(upper);
		System.out.println(lower);
	}

}
