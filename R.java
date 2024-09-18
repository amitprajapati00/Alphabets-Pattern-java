class R
{
	public static void main(String... ak)
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				 if (j == 1 // Left vertical line
                        || (i == 1 && j < 7 - 1) // Top horizontal line
                        || (i == 7 / 2 && j < 7 - 1) // Middle horizontal line
                        || (j == 7 - 1 && i > 1 && i < 7 / 2) // Right vertical line for top half
                        || (i - j == 7 / 2)) { // Diagonal line for R's leg
					System.out.print(" *");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}