package test;
import java.util.*;

public class FourthTest {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오");
		int fn = scan.nextInt();
		
		if(fn%2==0){
			System.out.println("입력하신수는 짝수입니다.");
		}
		else System.out.println("입력하신수는 홀수입니다.");


	}

}
