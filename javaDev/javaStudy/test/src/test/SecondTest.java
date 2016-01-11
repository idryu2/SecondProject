package test;
import java.util.*;
public class SecondTest {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하시오");
		int kor = scan.nextInt();
		
		System.out.println("영어점수를 입력하시오");
		int eng = scan.nextInt();
		
		System.out.println("수학점수를 입력하시오");
		int math = scan.nextInt();
		
		
	int sum = kor+eng+math;
	double avg = sum/3.0;
	System.out.println("국어점수는="+kor);
	System.out.println("영어점수는="+eng);
	System.out.println("수학점수는="+math);
	System.out.println("총점은="+sum);
	System.out.println("국어점수는="+ avg);
	}
	

}
