package com.niit.database;
import java.util.*;

public class RemoveDuplicates {
	public static int remove(int[] nums)
	{
		   for(int i=0;i<nums.length;i++)
			{
				for(int j=i+1;j<nums.length;j++)
				{
					if(nums[i]==nums[j])
					{   int k=j;
						while(k+1<=nums.length)
						{
						    nums[k]=nums[k+1];
						    k++;
						}
					}
				}
			}
			return nums.length;
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n;
		n=scn.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=scn.nextInt();
		}
		System.out.println(remove(nums));
		
		scn.close();

	}

}
