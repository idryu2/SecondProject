/*
 * 
 * 
 */
import java.util.Scanner;
public class 조건문4 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수입력 :");
		int kor = scan.nextInt();
		System.out.println("수학점수입력:");
		int math = scan.nextInt();
		System.out.println("영어점수입력 :");
		int eng = scan.nextInt();
	
		int tot = kor+eng+math;
		double avg = tot/3.0;
		System.out.println("총점은"+tot);
		System.out.printf("평균: %.2f\n",avg);
		
	if(kor>= 90 && kor<100)
		System.out.println("국어학점:A");
	if(kor>=80 && kor<90)
		System.out.println("국어학점 :B");
	if(kor>=70 && kor<80)
	System.out.println("국어학점 :C");	
	
	}
	

}
