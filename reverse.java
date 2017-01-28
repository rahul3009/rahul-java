class Reverse{
	public static void main(String []args)
	{
		int x=5284;
		int a,b=0;
		while(x>=1)
		{
			a=x%10;
			b=(b*10)+a;
			x=x/10;
		}
	System.out.println("the reverse of the no is"+b);
	}
}