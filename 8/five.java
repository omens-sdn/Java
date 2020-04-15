import java.util.Scanner;

public class five {
	public static void main(String[] args) {
		char[][] play = new char[6][7];
		for (int i = 0; i < 6; i++) // 初始化棋盘
		{
			for (int j = 0; j < 7; j++) {
				play[i][j] = ' ';
			}
		}
		show(play);
		int count;
		while(true)
		{
			drop("Red",play);
			show(play);
			if (isWon(play,'R'))// R赢
			{
				System.out.println("The red player won");
				break;
			}
			count = 0;// 平局
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					if (play[i][j] != ' ') {
						count++;
					}
				}
			}
			if (count == 42) {
				System.out.println("It ends in a draw");
				break;
			}
			drop("Yellow",play);
			show(play);
			if (isWon(play,'Y'))// Y赢
			{
				System.out.println("The yellow player won");
				break;
			}
			count = 0;// 平局
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					if (play[i][j] != ' ') {
						count++;
					}
				}
			}
			if (count == 42) {
				System.out.println("It ends in a draw");
				break;
			}
		} 
	}

	public static void show(char[][] play)// 展示棋盘
	{
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("|");
				System.out.print(play[i][j]);
			}
			System.out.println("|");
		}
		System.out.println("---------------");
	}

	public static boolean place(char[][] play, int a, char x) {//放置
		for (int i = 5; i >= 0; i--) {
			if (play[i][a] == ' ') {
				play[i][a] = x;
				return true;
			}
		}
		return false;
	}

	 public static void drop(String x, char[][] play) {//落棋
		 Scanner input = new Scanner(System.in);   
		 boolean done = false;
	        do {
	        	System.out.println("Drop a "+x+" disk at column (0-6):");
	        	int column=input.nextInt();
	            if (place(play, column, x.charAt(0)))
	                done = true;
	            else
	        		System.out.println("this column is full");
	        }
	        while (!done);
	    }

	public static boolean isWon(char[][] play,char x) {
		for(int i=5;i>=0;i--)//行
		{
			for(int j=0;j<7-3;j++)
			{
				if(play[i][j]==x&&play[i][j+1]==x&&play[i][j+2]==x&&play[i][j+3]==x)
				{
					return true;
				}
			}
		}
		for(int i=5;i>=0+3;i--)//列
		{
			for(int j=0;j<7;j++)
			{
				if(play[i][j]==x&&play[i-1][j]==x&&play[i-2][j]==x&&play[i-3][j]==x)
				{
					return true;
				}
			}
		}
		for(int i=5;i>=0+3;i--)//左斜
		{
			for(int j=0;j<7-3;j++)
			{
				if(play[i][j]==x&&play[i-1][j+1]==x&&play[i-2][j+2]==x&&play[i-3][j+3]==x)
				{
					return true;
				}
			}
		}
		for(int i=5;i>=0+3;i--)//右斜
		{
			for(int j=6;j>=0+3;j--)
			{
				if(play[i][j]==x&&play[i-1][j-1]==x&&play[i-2][j-2]==x&&play[i-3][j-3]==x)
				{
					return true;
				}
			}
		}
		return false;
		/*
		int count;
		for (int i = 5; i <= 0; i--)// 行
		{
			count = 1;
			for (int j = 0; j < 7 - 1; j++) {
				if (play[i][j] == play[i][j + 1])
					count++;
				else
					count = 1;
				if (count == 4)
					return true;
			}
		}
		for (int i = 5; i < 0; i--)// 列
		{
			count = 1;
			for (int j = 0; j < 7; j++) {
				if (play[i][j] == play[i - 1][j])
					count++;
				else
					count = 1;
				if (count == 4)
					return true;
			}
		}
		for (int i = 5; i <= 5- 2; i--)// 右斜
		{
			count = 1;
			for (int j = 0; j <= 6 - 3; j++) {
				if (play[i][j] == play[i - 1][j + 1])
					count++;
				else
					count = 1;
				if (count == 4)
					return true;
			}
		}
		for (int i = 5; i <= 5 - 2; i--)// 左斜
		{
			count = 1;
			for (int j = 3; j < 7; j++) {
				if (play[i][j] == play[i - 1][j - 1])
					count++;
				else
					count = 1;
				if (count == 4)
					return true;
			}
		}
		return false;
		*/
	}
}