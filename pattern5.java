class pattern5{
	public static void main(String []args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j>=6)
				System.out.print(i);
				else
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++)
			{
				if(i>j)
				System.out.print(i);
				else
				System.out.print(" ");
			}
			System.out.println("");
		}
		for(int i=4;i>=1;i--)
		{
			System.out.print(" ");
			for(int j=1;j<=4;j++)
			{
				if(i+j>=5)
				System.out.print(i);
				else
				System.out.print(" ");
			}
			for(int j=1;j<=4;j++)
			{
				if(i>j)
				System.out.print(i);
				else
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}