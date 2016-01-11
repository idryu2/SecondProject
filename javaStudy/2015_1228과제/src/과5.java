import java.util.*;
public class 과5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print(" 국어점수를 입력하시오= ");
		int a=scan.nextInt();
		System.out.print(" 영어점수를 입력하시오= ");
		int b=scan.nextInt();
		
		int c=(a+b)/2;
		char d;
		if(c>=90){
			d='A';
		}
		else if(c>=80){
			d='B';
		}
		else if(c>=70){
			d='C';
		}
		else if(c>=60){
			d='D';
		}
		else d='F';
		System.out.format("당신의 국어점수는 %d이고\n          영어점수는%d이며 학점은 %c입니다.",a,b,d);
	}

}
