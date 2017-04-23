package com.niit.database;

import java.util.Scanner;

public class DecimalToBinary {
	public static void binarytodecimal(int x)
	{
		 double m=1,a=1;
			int n=0;
			while(x>1)
			{	
				m=(m*10)+(x%2);
				x=x/2;
				a++;
			}
			m=(m*10)+1;
			m=m-Math.pow(10,a);
			while(m>=1)
			{
				n=(int) ((n*10)+(m%10));
				m=m/10;
			}
			System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		binarytodecimal(a);
		
		s.close();
		

	}

}
