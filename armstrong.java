class Armstrong{
	public static void main(String []args)
	{
		int x=371;
		int a,b=0,c;
		c=x;
		while(x>=1)
		{
			a=x%10;
			b=b+(a*a*a);
			x=x/10;
		}
		if(c==b)
		{
			System.out.print("it is an armstrong no");
		}
		else
		{
			System.out.print("it is not an armstrong no");
		}
	}
	}