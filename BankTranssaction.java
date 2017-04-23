package com.niit.database;
import java.util.*;

public class BankTranssaction {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int withdraw=scn.nextInt();
		float balance=scn.nextFloat();
		if(withdraw%5==0 && withdraw<=balance)
			System.out.printf("%.2f",(balance-withdraw-0.50));
		
		else if(withdraw%5!=0)
			System.out.printf("%.2f",balance);
		
		else
			System.out.printf("%.2f",balance);
		
		scn.close();
	}

}
