import java.util.Scanner;
public class six {
	public static void main(String[] args) {
		System.out.println("Enter the number of rows and columns in the array:");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int column = input.nextInt();
		System.out.println("Enter the array:");
		double[][] a = new double[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = input.nextDouble();
			}
		}
		System.out.println("The location of the largest element is " + locateLargest(a).maxValue + " at ( "
				+ locateLargest(a).row + " , " + locateLargest(a).column + " )");
	}
	public static Location locateLargest(double[][] a) {
		Location l = new Location();
		l.row = 0;
		l.column = 0;
		l.maxValue = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > l.maxValue) {
					l.row = i;
					l.column = j;
					l.maxValue = a[i][j];
				}
			}
		}
		return l;
	}
}
class Location {
	public int row;
	public int column;
	public double maxValue;
}