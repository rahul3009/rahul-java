package com.niit.database;

import java.util.Scanner;

public class SimilarDishes {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			String [] st1=new String[4];
			String [] st2=new String[4];
			int c=0;
			for(int i=0;i<4;i++)
			{
				st1[i]=s.next();
			}
			for(int i=0;i<4;i++)
			{
				st2[i]=s.next();
			}
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(st1[i].equals(st2[j]))
						c++;
				}
			}
			if(c>=2)
				System.out.println("similar");
			else
				System.out.println("dissimilar");
		}
		s.close();

	}

}
