package StudyjavaMain;
// 1,000 ������ �Ҽ��� ����(���� 1��

import java.util.Arrays;

class PrimeNumber1 {
	 public static void main(String[] args) {
	        int counter = 0;                                // ������ Ƚ��
	        int ptr = 0;                                    // ã�� �Ҽ��� ����
	        int[] prime = new int[500];                     // �Ҽ��� �����ϴ� �迭

	        prime[ptr++] = 2;                               // 2�� �Ҽ���

	        for (int n = 3; n <= 10; n += 2) {            // ���� ����� Ȧ����
	            int i;
	            for (i = 1; i < ptr; i++) {                 // �̹� ã�� �Ҽ��� ������ ��
	                counter++;
	                if (n % prime[i] == 0)                  // ����������� �Ҽ��� �ƴ�
	                	break;                              // �� �̻��� �ݺ��� ���ʿ�
	            }
	            if (ptr == i)                               // ���������� ����������� ����
	                prime[ptr++] = n;                       // �Ҽ��� �迭�� ����
	        }
	        System.out.println(Arrays.toString(prime));
//	        for (int i = 0; i < ptr; i++)                   // ã�� ptr���� �Ҽ��� ���
//	            System.out.println(prime[i]);

	        System.out.println("�������� ������ Ƚ�� : " + counter);
	    }
}