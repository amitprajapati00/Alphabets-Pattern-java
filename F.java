class F
{
	public static void main(String... ak)
	{
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(j==1||i==1||(i==4 && j<=5))
				{
					System.out.print(" *");
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}