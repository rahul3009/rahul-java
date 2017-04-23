package com.niit.database;
import java.util.*;

public class FactorialZeroes {

	public static void main(String[] args) {
		int n;
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		while(n>0)
		{
			int t;
			long s=1,c=0;
			t=scn.nextInt();
			while(t>0)
			{
				s=s*t;
				t--;
			}
			while(s%10==0)
			{
			s=s/10;
			c++;
			}
			System.out.println(c);
			n--;
		}
		scn.close();

	}

}
