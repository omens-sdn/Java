public class fifth {
	public static void main(String[] args) {
		int[][] queen = new int[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				queen[i][j] = 0;
			}
		}
		settle(queen, 0);
		for (int i = 0; i < 8; i++) {
			System.out.print("|");
			for (int j = 0; j < 8; j++) {
				if(queen[i][j]==1)
				System.out.print("Q|");
				else System.out.print(" |");
			}
			System.out.println();
		}
	}

	public static boolean check(int[][] queen, int i, int j) {//检查
		for (int x = 0; x < i; x++) {
			if (queen[x][j] == 1)
				return false;// 同一列
		}
		//从第一行往下执行，斜向的点只需考虑左上或者右上
		for (int x = 0; x < j; x++) {//x循环检查前面的行
			if (queen[i][x] == 1)
				return false;// 同一行  （点按照行来，可以不检查行）
			if (i - 1 - x >= 0 && queen[i - 1 - x][j - 1 - x] == 1)
				return false;// 左上侧斜向 
			if (i + 1 + x < 8 && queen[i + 1 + x][j - 1 - x] == 1)
				return false;// 右上侧斜向
		}
		return true;
	}

	public static boolean settle(int[][] queen, int x) {//递归回溯
		if (x == 8) {
			return true;//行数超过8，已经得到答案
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				queen[j][x] = 0;// 当前行清零
			}
			if (check(queen, i, x)) {
				queen[i][x] = 1;
				if (settle(queen, x + 1)) {
					return true;
				}
			}
		}
		return false;
	}
}