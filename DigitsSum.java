package com.niit.database;

import java.util.Scanner;

public class DigitsSum {

	public static void main(String[] args) {
		int t;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		while(t>0)
		{
			int n=s.nextInt();
			int sum=0;
			while(n>=1)
			{
				sum=sum+(n%10);
				n=n/10;
			}
			System.out.println(sum);
			t--;
		}
		s.close();
	}

}
