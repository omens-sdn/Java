import java.util.Scanner;
public class eight {
	public static void main(String[] args) {
		String[] words = { "write", "that", "program" ,"java","compile"};
		Scanner input = new Scanner(System.in);
		String action = "y";// ���Կ�ʼ
		while (action == "y") {
			int n = (int) (Math.random() * 5);//���ѡ�񵥴�
			int length = words[n].length();//�õ��ʵĳ���
			char[] ans = new char[length];//������
			int count = 0;// �������
			System.out.print("(Guess)Enter a letter in word ");
			for (int i = 0; i < length; i++) {
				ans[i] = '*';
				System.out.print("*");
			}
			System.out.print(" > ");
			while (!words[n].equals(new String(ans))) { // �Ƚ�char������string�ַ����Ƿ����
				String x = input.next();
				boolean flag = false;// ���Ե�������ĸ������
				for (int i = 0; i < length; i++) {
					if (words[n].charAt(i) == x.charAt(0)) {
						if (ans[i]!='*') // ���Ե�������ĸ�Ѿ�����
						{
							System.out.println(x.charAt(0) + " is already in the word");
							flag=true;
							break;
						}
						ans[i] = x.charAt(0);
						flag = true;
						
					}
				}
				if (words[n].equals(new String(ans)))//����ȷ���˳�����
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