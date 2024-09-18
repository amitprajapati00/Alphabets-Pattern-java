class V
{
	public static void main(String... ak)
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7*2-1;j++)
			{
				if (j == i || j == (7 * 2 ) - i) 
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