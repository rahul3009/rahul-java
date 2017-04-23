package com.niit.database;
import java.util.*;

public class SumsInTriangle {

	public static void main(String[] args) {
		int t;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		while(t>0)
		{
			int r=s.nextInt();
			int sum[]=new int[r];
			for(int i=0;i<r;i++)
			{	
				for(int j=0;j<=i;j++)
				{
					
						int n=s.nextInt();
						sum[i]+=n;
				}
			}
			int temp=sum[0];
			for(int i=1;i<r;i++)
			{
				if(sum[i]>temp)
					temp=sum[i];
			}
			System.out.println(temp);
						t--;
		}
		s.close();
	}

}
