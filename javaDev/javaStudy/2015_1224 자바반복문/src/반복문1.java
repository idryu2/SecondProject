/*
 * 
 * �ڹ� == �ݺ���
 * for : �ݺ�Ƚ���� ���� �� ��쿡 �ַλ��(����ġ
 * while : �ݺ�ȹ���� ���������ʴ°��(����ġ
 * do~while : ������ 1���̻� ����.(����ġ 

 *			#for ��
 *		����		1	  2		4
 *			for(�ʱⰪ; ���ǽ�; ������){
 *			3	}
 *		�������	1	-	2	-	3	-	4	-	2	-	3	-	4
 *			
 *
 *
 */

public class �ݺ���1 {

	public static void main(String[] args) {
	
		for(int i=1; i<=10; i++){
			System.out.println(i);
			for(int a =1; a<=5; a++){
				System.out.println(a);
				
			}
			
		}
	}

}
