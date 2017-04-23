package com.niit.database;
import java.util.*;

public class Arr42 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true)
		{int n=s.nextInt();
			if(n==42)
				break;
			else
				System.out.println(n);
		}
		
		s.close();
	}

}
