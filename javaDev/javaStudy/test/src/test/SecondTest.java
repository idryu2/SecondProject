package test;
import java.util.*;
public class SecondTest {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���������� �Է��Ͻÿ�");
		int kor = scan.nextInt();
		
		System.out.println("���������� �Է��Ͻÿ�");
		int eng = scan.nextInt();
		
		System.out.println("���������� �Է��Ͻÿ�");
		int math = scan.nextInt();
		
		
	int sum = kor+eng+math;
	double avg = sum/3.0;
	System.out.println("����������="+kor);
	System.out.println("����������="+eng);
	System.out.println("����������="+math);
	System.out.println("������="+sum);
	System.out.println("����������="+ avg);
	}
	

}
