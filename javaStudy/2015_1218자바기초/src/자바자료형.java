/*
 * 
 * �ڷ��� : �޸� ũ�� ====> ������ ����ø��� �޸� ũ�⸦ ����
 * (1,2,4,8byte)
 * 
 * 1. ��������
 * 		byte  1byte
 * 		short 2 3��
 * 		in t	  4 21�� default
 * 		long  8
 * 
 * 2. �Ǽ�����
 * 		float   4   10.5F   �Ҽ��� 6�ڸ�
 * 		double  8 default   �Ҽ��� 15�ڸ�
 * 
 * 
 * 3. ��������  2����Ʈ
 *		-���� ����. 0~65535
 *    �̱۹���Ʈ 1����Ʈ = �ƽ�Ű�ڵ�
 *    ��Ƽ����Ʈ 2����Ʈ = ����   �ڵ�
 *    char
 *    
 *    
 * 4. ������
 * 		boolean = true, false		
 * 
 * 
 * 	
 * 5. ���� ====> Ŭ����,�迭
 * 		���� 
 * 
 * 
 * 
 * 
 * 
 */
public class �ڹ��ڷ��� {
	public static void main(String[] args){
		int a = 2140000000;
		double d = 123456.78;
		double i = (double)((d-123456)*100);
	System.out.println((int)'A');
	System.out.println((char)67);
	System.out.println((int)' ');
	System.out.println((char)65);
	}


}
