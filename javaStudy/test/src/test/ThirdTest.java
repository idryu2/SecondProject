package test;
import java.util.*;
public class ThirdTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° �Ǽ��� �Է��Ͻÿ�");
		double fn = scan.nextDouble();
		System.out.println("�ι�° �Ǽ��� �Է��Ͻÿ�");
		double sn = scan.nextDouble();
	
		double a = fn+sn;
		double b = fn-sn;
		double c = fn*sn;
		System.out.println("�Է��� �νǼ��� ����"+a);
		System.out.println("�Է��� �νǼ��� ����"+b);
		System.out.println("�Է��� �νǼ��� ����"+c);
	}

}
