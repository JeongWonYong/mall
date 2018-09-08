package com.mall.shop;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num = factorial(4);

		Scanner in 	  = new Scanner(System.in);
		String str 	  = in.next();
		String tmpStr = new String();
		int strLen	  = str.length();
		int sign   	  = 0;
		int num	   	  = 0;
		int num2;
		
		for(int i=0; i<strLen; i++) {
			tmpStr = str.substring(i, (i+1));
			if( i == 0 && tmpStr.equals("1") ) sign = 1;
			if( sign == 1 ) tmpStr = ( tmpStr.equals("1") ) ? "0" : "1";

			if( tmpStr.equals("1") ) {
				num2 = 1;
				for(int j=1; j < (strLen - i); j++) {
					num2 *= 2;
				}
				num += num2;
			}
		}
		if( sign == 1 ) {
			num += 1;
			num -= (num*2);
		}
		System.out.println(num);
	}
	
	public static int factorial(int num) {
		System.out.print(num + " => ");
		if(num > 1) num = num * factorial(num-1);
		//System.out.println(num);
		return num;		
	}
}