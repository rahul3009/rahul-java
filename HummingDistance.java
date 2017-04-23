package com.niit.database;

import java.util.Scanner;

public class HummingDistance {
	public static int hummingdistance(int x,int y)
	{
		int a=1,max=x;
		if(y>x)
			max=y;
		while(max>1)
		{
			max=max/2;
			a++;
		}
		int [] m=new int[a];
		int [] n=new int[a];
		for(int i=0;i<a;i++)
		{	m[i]=n[i]=0;
			if(x>1)
			{
				m[i]=x%2;
				x=x/2;
			}
			if(y>1)
			{
				n[i]=y%2;
				y=y/2;
			}
		}
		int s=0;
		for(int i=0;i<a;i++){
			if(m[i]!=n[i])
				s++;
		}
		
		return s;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(hummingdistance(a,b));
		
		s.close();
	}

}
