package AlgorithmsNDataStructuresRecursive;

//�ϳ����� ž

import java.util.Scanner;

class Hanoi {
 //--- no���� ������ x�� ��տ��� y�� ������� �ű� ---//
 static void move(int no, int x, int y) {
     if (no > 1)
         move(no - 1, x, 6 - x - y); //��չ�ȣ�� 1,2,3���� ǥ��, ��� ��ȣ�� ���� 6�̹Ƿ� ���� ���, ��ǥ����� ������ �߰� ����� 6-x-y�� ǥ��

     System.out.printf("����[%d]�� %d�� ��տ��� %d�� ������� �ű�\n", no, x, y);

     if (no > 1)
         move(no - 1, 6 - x - y, y);
 }

 public static void main(String[] args) {
     Scanner stdIn = new Scanner(System.in);

     System.out.println("�ϳ����� ž");
     System.out.print("������ ���� : ");
     int n = stdIn.nextInt();

     move(n, 1, 3);    // �� 1 ��տ� ���� n���� �� 3 ������� �ű�
 }
}