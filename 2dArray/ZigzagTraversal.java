// JAVA Code for Zigzag (or diagonal)
// traversal of Matrix

class GFG {

	public static int R, C;
	public static boolean isValid(int i, int j)
	{
		if (i < 0 || i >= R
			|| j >= C || j < 0)
			return false;
		return true;
	}
	public static void main(String[] args)
	{
		int arr[][] = {
			{ 1, 2, 3, 4 },	
			{ 5, 6, 7, 8 },
			{ 9, 10, 11, 12 },
			{ 13, 14, 15, 16 },
			{ 17, 18, 19, 20 },
		};

		R = arr.length;
		C = arr[0].length;
        for (int k = 0; k < R; k++) {
			System.out.print(arr[k][0] + " ");

			// set row index for next
			// point in diagonal
			int i = k - 1;
			
			// set column index for
			// next point in diagonal
			int j = 1;

			/* Print Diagonally upward */
			while (isValid(i, j))
			{
				System.out.print(arr[i][j] + " ");

				i--;
				
				// move in upright direction
				j++;
			}

			System.out.println("");
		}
        for (int k = 1; k < C; k++) {
			System.out.print(arr[R - 1][k] + " ");

			// set row index for next
			// point in diagonal
			int i = R - 2;
			
			// set column index for
			// next point in diagonal
			int j = k + 1;

			/* Print Diagonally upward */
			while (isValid(i, j))
			{
				System.out.print(arr[i][j] + " ");

				// move in upright direction
				i--;
				j++;
			}

			System.out.println("");
		}
	}
}