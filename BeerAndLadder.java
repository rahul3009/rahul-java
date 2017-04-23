package com.niit.database;

import java.util.Scanner;

public class BeerAndLadder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int q=s.nextInt();
		while(q-->0)
		{
			int a=s.nextInt();
			int b=s.nextInt();
			if(a%2==0){
				if(b==a-1)
					System.out.println("YES");
				else if(b==a-2)
					System.out.println("YES");
				else if(b==a+2)
					System.out.println("YES");
				else
					System.out.println("NO");
				
			}
			else if(a%2==1)
			{
				if(b==a+1)
					System.out.println("YES");
				else if(b==a+2)
					System.out.println("YES");
				else if(b==a-2)
					System.out.println("YES");

				else
					System.out.println("NO");
			}
		}
		s.close();

	}

}
