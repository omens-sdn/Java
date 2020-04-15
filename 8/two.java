import java.util.Scanner;

public class two {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r1, c1, r2, c2;
		char[][] play = new char[3][3];
		for (int i = 0; i < 3; i++) //初始化棋盘
		{
			for (int j = 0; j < 3; j++) {
				play[i][j] = ' ';
			}
		}
		show(play);
		while (check(play)) {
			System.out.println("Enter a row (0,1, or 2) for player X: ");
			r1 = input.nextInt();
			System.out.println("Enter a column (0,1, or 2) for player X: ");
			c1 = input.nextInt();
			play[r1][c1] = 'X';
			show(play);
			if (check(play)) {
				System.out.println("Enter a row (0,1, or 2) for player O: ");
				r2 = input.nextInt();
				System.out.println("Enter a column (0,1, or 2) for player O: ");
				c2 = input.nextInt();
				play[r2][c2] = 'O';
				show(play);
			}
			else break;
		}
	}

	public static void show(char[][] play)// 展示棋盘
	{
		for (int i = 0; i < 3; i++) {
			System.out.println("-------");
			for (int j = 0; j < 3; j++) {
				System.out.print("|");
				System.out.print(play[i][j]);
			}
			System.out.println("|");
		}
		System.out.println("-------");
	}

	public static boolean check(char[][] play)// 判断输赢
	{
		for (int i = 0; i < 3; i++) // 同一行
		{
			if (play[i][0] == 'X' && play[i][1] == 'X' && play[i][2] == 'X') {
				System.out.println("X player won");
				return false;
			} else if (play[i][0] == 'O' && play[i][1] == 'O' && play[i][2] == 'O') {
				System.out.println("O player won");
				return false;
			}
		}
		for (int i = 0; i < 3; i++) // 同一列
		{
			if (play[0][i] == 'X' && play[1][i] == 'X' && play[2][i] == 'X') {
				System.out.println("X player won");
				return false;
			} else if (play[0][i] == 'O' && play[1][i] == 'O' && play[2][i] == 'O') {
				System.out.println("O player won");
				return false;
			}
		}
		// 同一对角线
		if ((play[0][0] == 'X' && play[1][1] == 'X' && play[2][2] == 'X')
				|| (play[0][2] == 'X' && play[1][1] == 'X' && play[2][0] == 'X')) {
			System.out.println("X player won");
			return false;
		}
		if ((play[0][0] == 'O' && play[1][1] == 'O' && play[2][2] == 'O')
				|| (play[0][2] == 'O' && play[1][1] == 'O' && play[2][0] == 'O')) {
			System.out.println("O player won");
			return false;
		}
		return true;
	}
}