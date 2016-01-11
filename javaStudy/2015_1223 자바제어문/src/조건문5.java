import java.util.*;

public class 조건문5 {

	public static void main(String[] args) {
		//if else문
		System.out.println("1~100사이의정수");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num<1 || num>100){
			System.out.println("잘못된 입력입니다.");
		}
	
		else {
			System.out.println("입력된값은:"+num);
		}
		if(num%2==0){
			System.out.println(num+"은는 짝수입니다.");
		}
		else{
			System.out.println(num+"은는 홀수입니다.");
		}
		
		

	}

}
