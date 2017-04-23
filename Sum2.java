package com.niit.database;

import java.util.Scanner;

public class Sum2 {
	
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n>0)
		{
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println(a+b);
			n--;
		}
		s.close();
	}

}
