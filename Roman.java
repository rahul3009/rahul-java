package com.niit.database;

import java.util.Scanner;

public class Roman {
		public static int romantoint(String s)
		{
			    int sum=0;
			    if(s.indexOf("IV")!=-1){sum-=2;}
			    if(s.indexOf("IX")!=-1){sum-=2;}
			    if(s.indexOf("XL")!=-1){sum-=20;}
			    if(s.indexOf("XC")!=-1){sum-=20;}
			    if(s.indexOf("CD")!=-1){sum-=200;}
			    if(s.indexOf("CM")!=-1){sum-=200;}
			    
			    char c[]=s.toCharArray();
			    
			    
			   for(int count=0;count<s.length();count++){
			       if(c[count]=='M') sum+=1000;
			       else if(c[count]=='D') sum+=500;
			       else if(c[count]=='C') sum+=100;
			       else if(c[count]=='L') sum+=50;
			       else if(c[count]=='X') sum+=10;
			       else if(c[count]=='V') sum+=5;
			       else if(c[count]=='I') sum+=1;
			       
			   }
			   
			   return sum;
		}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.next();
		System.out.println(romantoint(st));
		
		s.close();
	}

}
