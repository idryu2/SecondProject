import java.util.*;
public class 조건문7 {
	public static void main(String[] args){
/*
		System.out.println((int)'+');
		System.out.println((int)'-');
		System.out.println((int)'*');
		System.out.println((int)'/');
		
*/	
		char op = '/';
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수입니다.");
		int num1 = scan.nextInt();
		
		System.out.println("두번째 정수입니다.");
		int num2 = scan.nextInt();
		int num3=0;
		if(op=='+'){
			num3 = num1+num2;
		}
		else if(op=='-'){
			num3 = num1-num2;
		}
		else if(op=='*'){
			num3 = num1*num2;
		}
		else if(op=='/'){
			if(num2==0){
			System.out.println("오류입니다.");
		}
			
			num3 = num1/num2;
		}
		System.out.printf("%d%c%d=%d" ,num1,op,num2,num3);
		
		
	}

}
