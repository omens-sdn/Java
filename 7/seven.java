import java.util.Scanner;
public class seven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter list1:");
		int n1 = input.nextInt();
		int[] list1 = new int[n1];
		for (int i = 0; i < n1; i++)
			list1[i] = input.nextInt();
		System.out.println("Enter list2:");
		int n2 = input.nextInt();
		int[] list2 = new int[n2];
		for (int i = 0; i < n2; i++)
			list2[i] = input.nextInt();
		int[] list = new int[n1 + n2];
		int m = 0;
		int n = 0;
		for (int i = 0; i < n1 + n2; i++) {
			if (m < n1 && n < n2) {          //1、2均未遍历完
				if (list1[m] <= list2[n]) {
					list[i] = list1[m];
					m++;
				} else if (list1[m] > list2[n]) {
					list[i] = list2[n];
					n++;
				} 
			}
			else if (m<n1)            //1未遍历完
			{
				list[i]=list1[m++];
			}
			else if (n<n2)            //2未遍历完
			{
				list[i]=list2[n++];
			}
		}
		System.out.print("The merged list is ");
		for (int i = 0; i < n1 + n2; i++) {
			System.out.print(list[i] + " ");
		}
	}
}