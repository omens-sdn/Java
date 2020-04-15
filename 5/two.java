public class two {
	public static void main(String[] args) {
		int count = 0;
		int number = 100;
		while (number <= 200) {
			if ((number % 5 == 0 || number % 6 == 0) && number % 30 != 0) {
				count++;
				if (count % 10 == 0) {
					System.out.println(number);
				} else
					System.out.print(number + " ");
			}
			number++;
		}
	}
}