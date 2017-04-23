package com.niit.database;
import java.util.*;

public class Divide {
	public static int divide(int divident,int divisor)
	{
		int c=0;
		while(divisor<=divident)
		{
			divident=divident-divisor;
			c++;
		}
		if(divident==0)
			return c;
		else
		{
			if(divident>divisor)
				return divident;
			else
				return divisor;
		}
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int divisor=scn.nextInt();
		int divident=scn.nextInt();
		int d=divide(divident,divisor);
		System.out.println(d);
		scn.close();
	}

}
