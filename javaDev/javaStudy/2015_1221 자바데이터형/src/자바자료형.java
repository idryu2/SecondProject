		/*
		 * �ڷ���
		 * 
		 * ������
		 * 		byte   2^7
		 * 		short 2^15
		 *		 int +- 2^31
 		 * 		long +- 2^63
 		 * 			***********int vs long ==100L �α��� 
 		 * 
		 * �Ǽ���
		 * float �Ҽ��� 6�ڸ�
		 * 
		 * double �Ҽ��� 15�ڸ�
		 * === Default���� double
		 ***********float vs double ==== 10.5F �α���
		 * ������
		 * char��   ���� �Ѱ��� ǥ��
		 * 0~65535 ==������ �� ǥ������= �����ڵ�
		 *  
		 * 
		 * ����
		 * Boolean  = true false
		  == ���ǹ��� �ַ� ����.
		  
		  ===================> ������ ���Ŀ��� ũ�⸦ �����Ҷ� ����Ѵ�.
		  ===> ������ ������.
		 *1.���ϵ����� �����ϴ� �޸𸮴� ����.
		       ���� = ���Ҽ��ִ� ��
		  		�������� = �޸� ũ�⼱�� ������ ����  = ��
		  				int a = 10;������.
		  				���� ��{} �� ���� �̸��� �������Ұ�
		  				�����Ŀ� ���߿� ���� ����
		  				ex> int a;
		  				a =10;
		 				int a,b,c;
		 				int a=10,b=20,c=30; 			
		 *		������ �����(�ĺ���)
		 			1)���ĺ��̳� �ѱ۷� ����
		 			2)���ڻ�밡��
		 			3)Ư�����ڻ�밡��		
		 			4)Ű����� ���Ұ�.
		 ************************ ���̹� ���  ***************************
		  		1)Ŭ�������� ù���ĺ��� �빮��.
		   		2)������ �޼ҵ�� ù�ڴ� �ҹ���.
		   		3)2���̻� �ܾ�̿��Ҷ� �ι�° ������ �빮��.
		 *   ===> �ڷ����� ��ȯ
		  			�ڷ�����ũ��
		  		byte - short - int - long - float - double
		 *   ===> �ڷ��� �۰� �����.
		    (int)10.5 = double =>int
		    ��������ȯ
		 *   ===> �ڷ��� ũ�Ը����.
				(double)10 => int => double
				�ڵ�����ȯ
				
				
				
	 	  
		  */					
public class �ڹ��ڷ��� {	
	
	public static void main(String[] args) {
		byte byteValue = 127;
		short shortValue = 32767;
		int intValue = 2147483647;
		long longValue = 3000000000900000000L;
		float floatValue = 10.5F;
		double doubleValue = 10.5;
		char charValue = 'ȫ';
		boolean booleanValue = true;
		
		System.out.println("�� = " + byteValue);
		System.out.println("�� = " + shortValue);
		System.out.println("�� = " + intValue);
		System.out.println("�� = " + longValue);
		System.out.println("�� = " + floatValue);
		System.out.println("�� = " + doubleValue);
		System.out.println("�� = " + charValue);
		System.out.println("�� = " + booleanValue);
		
	}

}
