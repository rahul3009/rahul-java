class patten6{
	public static void main(String []args)
	{
		
		for(int i=1;<5;i++)
		{
			int s=i;
			for(int j=1;j<5;j++)
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
			System.out.println("");
		}
		
	}																		  	
	}