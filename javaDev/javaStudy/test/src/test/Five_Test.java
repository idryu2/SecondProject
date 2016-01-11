package test;
import java.util.*;

public class Five_Test {
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	System.out.println("정수를 입력하시오");
	int a = scan.nextInt();
	
	if (a%3==0){
		System.out.println("입력하신 정수는 3의배수입니다.");
	}
	if (a%5==0){
		System.out.println("입력하신 정수는 5의배수입니다.");
	}
	if (a%8==0){
		System.out.println("입력하신 정수는 8의배수입니다.");
	}

}
}
