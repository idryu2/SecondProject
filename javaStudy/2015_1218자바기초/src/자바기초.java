/*
 * 
 * 1>�ڹ� ����
 * 		A.java ====> A.class ====>����
 * 			javac�� ����� ��ȯ�����ִ°�         java<����������>
 * 								  ==========JVM
 * 2> �ڹٿ��� ����ϴ� ������ ǥ����
 * 			1. ����
 * 				====>10����
 * 				====>8����      0���� �����ϴ� ��
 * 				====>16����     0x�� �����ϴ� �� 
 * 
 * 			2. ����
 * 	 		= 'A', 'a'  '0' ���  ���ڸ��� �������ڸ� ����������
 * 			  65   97   48
 * 
 * 			3. ���ڿ�
 * 				="ȫ�浿"
 * 
 * 			4. �Ǽ�
 * 				= 10.5(8byte)  10.5F(4byte)
 * 
 * 			5. �Ҹ�
 * 				= true, false
 * 
 * 
 * */
public class �ڹٱ��� {

	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(011);
		System.out.println(0x55);
		
		System.out.println('A');
		System.out.println('ȫ');
		
		System.out.println("ȫ�浿");
		
		System.out.println(10.5);
		System.out.println(10.5F);

		System.out.println(true);
		System.out.println(false);
		
		// ���ڿ� ���� (+)
		System.out.println("7"+7+"7"+7+7);
		//77777
		System.out.println(7+7+7+7+7);
		System.out.println(7+7+7+7+"7");
		
		
	}

}
