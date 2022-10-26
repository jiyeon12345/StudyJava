package AlgorithmsNDataStructures.Recursive;

//����5-5(2)
//��� �޼��� recur�� �޸�ȭ��  ����(ȣ���� ȸ���� ī��Ʈ)
//
import java.util.Scanner;

class RecurMemoCount {

	static String[] memo;
	static int count;

	//--- �޸�ȭ�� ������ �޼��� recur ---//
	static void recur(int n) {
		count++;
		if (memo[n + 1] != null)
			System.out.print(memo[n + 1]);											// �޸� ���
		else {
			if (n > 0) {
				recur(n - 1);
				System.out.println(n);
				recur(n - 2);
				memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];		// �޸�ȭ
			} else {
				memo[n + 1] = "";	 // �޸�ȭ : recur(0)�� recur(-1)�� �� ���ڿ�
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : ");
		int x = stdIn.nextInt();

		memo = new String[x + 2];
		recur(x);

		System.out.println("�޼��带 ȣ���� ȸ�� : " + count);		
	}
}
