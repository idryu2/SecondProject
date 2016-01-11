package test;
import java.util.*;
public class ThirdTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 실수를 입력하시오");
		double fn = scan.nextDouble();
		System.out.println("두번째 실수를 입력하시오");
		double sn = scan.nextDouble();
	
		double a = fn+sn;
		double b = fn-sn;
		double c = fn*sn;
		System.out.println("입력한 두실수의 합은"+a);
		System.out.println("입력한 두실수의 차는"+b);
		System.out.println("입력한 두실수의 곱은"+c);
	}

}
