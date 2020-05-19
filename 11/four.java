import java.util.ArrayList;
import java.util.Scanner;
public class four {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 integers:");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int value = input.nextInt();
			list.add(value);
		}
		removeDuplicate(list);
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if(list.lastIndexOf(list.get(i))!=i)
				list.remove(list.lastIndexOf(list.get(i)));
		}
	}
}