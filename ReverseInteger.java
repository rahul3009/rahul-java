package com.niit.database;
import java.util.*;

public class ReverseInteger {
		public static int reverse(int x)
		{
			  long b=0;
				if(x<0)
				{
					x=-x;
					while(x>=1)
					{
						b=(b*10)+(x%10);
						x=x/10;
					}
					b=-b;
				}
				while(x>=1)
				{
					b=(b*10)+(x%10);
					x=x/10;
				}
				if(b>-2147483648 && b<2147483647)
				return (int)b;
				else
					return 0;
		}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int x,y;
		x=scn.nextInt();
		y=reverse(x);
		System.out.println(y);
		}

}
