package com.niit.database;
import java.util.Scanner;

class Div {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
			int a=s.nextInt();
			int b=s.nextInt();
			int c=a%b;
			System.out.println(c);
			t--;
		}
		s.close();

	}

}
