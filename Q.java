class Q
{
	public static void main(String... ak)
	{
		int size=7;
		 // Outer loop for rows
        for (int i = 0; i < size; i++) {
            // Inner loop for columns
            for (int j = 0; j < size; j++) {
                // Conditions to print the Q shape
                if ((i == 0 && j > 0 && j < size - 1) // Top line (excluding corners)
                        || (i == size - 1 && j > 0 && j < size - 2) // Bottom line (excluding corners)
                        || (j == 0 && i > 0 && i < size - 1) // Left vertical line
                        || (j == size -1 && i > 0 && i < size ) // Right vertical line
                        || (i == j && i >= size / 2))  // Diagonal line for Q's tail
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