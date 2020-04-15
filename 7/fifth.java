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

	public static boolean check(int[][] queen, int i, int j) {//���
		for (int x = 0; x < i; x++) {
			if (queen[x][j] == 1)
				return false;// ͬһ��
		}
		//�ӵ�һ������ִ�У�б��ĵ�ֻ�迼�����ϻ�������
		for (int x = 0; x < j; x++) {//xѭ�����ǰ�����
			if (queen[i][x] == 1)
				return false;// ͬһ��  ���㰴�����������Բ�����У�
			if (i - 1 - x >= 0 && queen[i - 1 - x][j - 1 - x] == 1)
				return false;// ���ϲ�б�� 
			if (i + 1 + x < 8 && queen[i + 1 + x][j - 1 - x] == 1)
				return false;// ���ϲ�б��
		}
		return true;
	}

	public static boolean settle(int[][] queen, int x) {//�ݹ����
		if (x == 8) {
			return true;//��������8���Ѿ��õ���
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				queen[j][x] = 0;// ��ǰ������
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