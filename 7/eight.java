import java.util.Scanner;
public class eight {
	public static void main(String[] args) {
		String[] words = { "write", "that", "program" ,"java","compile"};
		Scanner input = new Scanner(System.in);
		String action = "y";// 测试开始
		while (action == "y") {
			int n = (int) (Math.random() * 5);//随机选择单词
			int length = words[n].length();//该单词的长度
			char[] ans = new char[length];//答案数组
			int count = 0;// 错误计数
			System.out.print("(Guess)Enter a letter in word ");
			for (int i = 0; i < length; i++) {
				ans[i] = '*';
				System.out.print("*");
			}
			System.out.print(" > ");
			while (!words[n].equals(new String(ans))) { // 比较char数组与string字符串是否相等
				String x = input.next();
				boolean flag = false;// 测试单词中字母不存在
				for (int i = 0; i < length; i++) {
					if (words[n].charAt(i) == x.charAt(0)) {
						if (ans[i]!='*') // 测试单词中字母已经存在
						{
							System.out.println(x.charAt(0) + " is already in the word");
							flag=true;
							break;
						}
						ans[i] = x.charAt(0);
						flag = true;
						
					}
				}
				if (words[n].equals(new String(ans)))//答案正确，退出猜字
					break;
				if (!flag) {
					count++;
					System.out.println(x.charAt(0) + " is not in the word");
				}
				System.out.print("(Guess)Enter a letter in word ");
				for (int ii = 0; ii < length; ii++) {
					System.out.print(ans[ii]);
				}
				System.out.print(" > ");
			}
			System.out.println("The word is " + words[n] + ". You missed " + count + " time");
			System.out.println("Do you want to guess another word? Enter y or n >");
			action = input.next();
		}
	}
}