package com.onesoft.day6_for;

public class AddingNumber {
	public static void main(String[] args) {
		int total=0;
		for(int i=1;i<=10;i++) {
		total=total+i;
		}
		System.out.println(total);
		//50 to 100 add
		int a=0;
		for(int i=50;i<=100;i++) {
			a=a+i;
			
		}
		System.out.println(a);
		
		//350 to 200 add
		int b=0;
		for(int i=350;i>=200;i--) {
			b=b+i;
		}
		System.out.println(b);
		//5 t0 10 multiply
		int c=1;
		for(int i=5;i<=10;i++) {
			c=c*i;//factorial
		}
		System.out.println("the factorial of the given number is"+c);
	}

}
