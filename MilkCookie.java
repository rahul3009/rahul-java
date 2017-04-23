package com.niit.database;

import java.util.Scanner;

public class MilkCookie {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int flag=0;
			int n=s.nextInt();
			String [] st=new String[n+1];
			for(int i=0;i<n;i++)
			{
				st[i]=s.next();
			}
			st[n]="abc";
			for(int i=0;i<n;i++)
			{
				if(st[i].equals("cookie") )
				{
					if(st[i+1].equals("milk"))
						flag=0;
					else
						flag=1;
					
				}
				if(flag==1)
					break;
			}
			if(flag==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		s.close();

	}

}
