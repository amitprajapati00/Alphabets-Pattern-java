class S
{
	public static void main(String... ak)
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if((i==1
					||j>7-1 && i > 7/ 2 )
					||(j==1 && i<4)
					||(i==4)
					||(i==7)// && i>4)
					)
					{
						System.out.print(" *");
					}
					else
					{
						System.	out.print(" ");
					}
			}
			System.out.println();
		}
	}
}