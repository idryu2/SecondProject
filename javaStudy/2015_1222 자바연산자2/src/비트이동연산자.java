/*
 * 
 * ���α׷� �������
 * 	1. ������ ����  == ����
 * 	2. ������ ����ó�� == ������
 * 	3. ó���� ��� ��� == System.out.println();
 * 		  ==> System.out.println();
 * 		==> System.out.print()
 * 		==> System.out.printf(); == ������ �������ִ� ���
 * 			System.out.printf("%5d %d %d" ,10,20,30);	
 * 			System.out.printf();
 * ������
 * SUN == oracle
 *-----   -------
 * 1.7		1.8   ==> pointer <- ���ٽ�, ����ȥ
 * 			  c + ���̽�
 * 
 * 		��Ʈ�̵� ������ (<<�����̵�, >>�������̵�)
 * 		10<<2 == ��������ȯ�� �ڿ� 0�� 2�����δ�. ex) 1010 ==> 101000
 * 
 * 
 * 
 * 
 * 
 * 
 */



public class ��Ʈ�̵������� {

	public static void main(String[] args){
		int a = 10;
		int c = 20;
		
				System.out.println(Integer.toBinaryString(a));
				System.out.println(c);
	}
}
