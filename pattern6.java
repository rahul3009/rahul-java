class patten6{
	public static void main(String []args)
	{
		
		for(int i=1;i<=5;i++)
		{
			int s,t;
			s=i;
			t=2*(i-1);
			for(int j=1;j<=5;j++)
			{
				if(i+j>=6)
				{
					System.out.print(s);
					s++;
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			for(int k=1;k<=5;k++)
			{
				if(i>k)
				{
					System.out.print(t);
					t--;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}																		  	
	}