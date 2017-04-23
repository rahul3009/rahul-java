package com.niit.database;

public class TestGraduation {
	
	public Graduation display(String co)
	{
		if(co.equalsIgnoreCase("Raju"))
			return new Btech();
		else if(co.equalsIgnoreCase("raj"))
			return new Bba();
		else if(co.equalsIgnoreCase("ram"))
			return new Bca();
		return null;
	}

	

}
