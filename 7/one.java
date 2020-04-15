import java.util.Scanner;

public class one {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers:");
		int[] a = new int[10];
		int count = 0;
		int[] b = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = input.nextInt();
			boolean flag = true;
			for (int j = 0; j < i; j++) {
				if (a[j] == a[i]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				b[count++] = a[i];
			}
		}
		System.out.println("the number of distinct number is "+count);
		System.out.print("the distinct numbers are: ");
		for(int i=0;i<b.length&&b[i]!=0;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
