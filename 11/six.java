import java.util.ArrayList;
import java.util.Scanner;
public class six {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer m:");
		int m = input.nextInt();
		int n = 1;
		list = Factor(m);
		for (int j = 0; j < list.size(); j++) {
			int count = 0;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) == list.get(j))
						count++;
				}
				if (count%2!=0 &&(j==0||list.get(j)!=list.get(j-1)))
					n *= list.get(j);
		}
		System.out.println("The smallest number n for m*n to be a perfect square is " + n);
		System.out.println("m*n is " + m * n);
	}

	public static ArrayList<Integer> Factor(int m) {
		ArrayList<Integer> list = new ArrayList<>();
		int i = 2;
		while (m != 1) {
			if (m % i == 0) {
				list.add(i);
				m = m / i;
				// System.out.println(i);
			} 
			else {
				i++;
				continue;
			}
		}
		return list;
	}
}