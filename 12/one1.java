public class one1 {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}
		for (int i = 0; i <= 2; i += 2) {
			for (int j = 0; j < args[i].length(); j++) {
				if (args[i].charAt(j) >= 48 && args[i].charAt(j) <= 57) {
					continue;
				} 
				else {
					System.out.println("Wrong Input: " + args[i]);
					System.exit(1);
				}
			}
		}
		int result = 0;
		switch (args[1].charAt(0)) {
		case '+':
			result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			break;
		case '-':
			result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			break;
		case '.':
			result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			break;
		case '/':
			result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
		}
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	}
}