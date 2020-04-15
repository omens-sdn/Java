import java.util.Scanner;
public class four {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the row ,column and values of the two-dimensional array:");
		int r = input.nextInt();
		int c = input.nextInt();
		int[][] value = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				value[i][j] = input.nextInt();
			}
		}
		if (isConsecutiveFour(value))
			System.out.println("true");
		else
			System.out.println("false");
	}

	public static boolean isConsecutiveFour(int[][] values) {
		for (int i = 0; i < values.length; i++) {//行
			for (int j = 0; j < values[i].length - 3; j++) {
				if(values[i][j]==values[i][j+1]&&values[i][j]==values[i][j+2]&&values[i][j]==values[i][j+3])
				{
					return true;
				}
				}
			}
		for (int i = 0; i < values.length-3; i++) {//列
			for (int j = 0; j < values[i].length; j++) {
				if(values[i][j]==values[i+1][j]&&values[i][j]==values[i+2][j]&&values[i][j]==values[i+3][j])
				{
					return true;
				}
				}
			}
		for (int i = 0; i < values.length-3; i++) {//右斜
			for (int j = 0; j < values[i].length - 3; j++) {
				if(values[i][j]==values[i+1][j+1]&&values[i][j]==values[i+2][j+2]&&values[i][j]==values[i+3][j+3])
				{
					return true;
				}
				}
			}
		for (int i = 3; i < values.length; i++) {//左斜
			for (int j = 3; j < values[i].length ; j++) {
				if(values[i][j]==values[i-1][j-1]&&values[i][j]==values[i-2][j-2]&&values[i][j]==values[i-3][j-3])
				{
					return true;
				}
				}
			}
		/*
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
		for (int i = 0; i < values.length; i++) {
			count1 = 1;
			for (int j = 0; j < values[i].length - 1; j++) {
				if (values[i][j] == values[i][j + 1])
					count1++;// 行
				else count1 = 1;
				if(count1==4) return true;
			}
		}
		for (int i = 0; i < values.length - 1; i++) {
			count2 = 1;
			for (int j = 0; j < values[i].length ; j++) {
			if (values[i][j] == values[i+1][j])
				count2++;// 列
			else count2 = 1;
			if ( count2 == 4 ) return true;
			}
		}
		for (int k = 3; k < values.length; k++) {
			count3 = 1;
			for (int i = 1; i <= k && i < values.length; i++) {
				int j = k - i;
				if (values[i][j] == values[i-1][j + 1]) count3++;
				else count3 = 1;
				if (count3 == 4) return true;
			}
		}
        for (int k = values[0].length; k <=values[0].length+values.length-5; k++) {
            count4 = 1;
            for (int j=values[0].length-2; j <= k && j >= 0; j--) {
                int i = k - j;
                if(i==values.length)
                    break;
                if (values[i][j] == values[i - 1][j + 1]) count4++;
                else count4 = 1;
                if (count4 == 4) return true;
            }
        }
        */
        return false;
	}
}