package com.niit.database;
import java.util.*;
public class Pallindrom {
	public static boolean ispalindrome(int x)
	{
		long b=0;
		int c=x;
		if(x<0)
			return false;
		while(x>=1)
		{
			b=(b*10)+(x%10);
			x=x/10;
		}
		System.out.println(b);
		
		if(b==c)
		return true;
		else 
			return false;
        
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a;
		a=s.nextInt();
		System.out.println(ispalindrome(a));
		s.close();

	}

}
