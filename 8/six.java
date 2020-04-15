import java.util.Scanner;
public class six {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows in the matrix:");
		int row = input.nextInt();
		System.out.println("Enter the matrix row by row:");
		int[][] ma = new int[row][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				ma[i][j] = input.nextInt();
			}
		}
		int max = 0;
		int mi = 0;
		int mj = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				for (int k = 0; k < row - j && k < row - i; k++) {
					if (ma[i][j] == ma[i][j + k] && ma[i][j] == ma[i + k][j] && ma[i][j] == ma[i + k][j + k]) {
						if (max < k) {
							max = k;
							mi = i;
							mj = j;
						}
					}
					else break;
				}
			}
		}
		System.out.println("The maximum square submatrix is at ( "+mi+" , "+mj+" ) with size "+(max+1));
	}
}