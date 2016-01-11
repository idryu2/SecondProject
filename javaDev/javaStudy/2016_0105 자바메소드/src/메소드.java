/*
 * 메소드 : 한개의 기능을 수행하는 명령문의 집합
 * 	======== (재사용이 가능)
 * 	반복수행하는 기능
 * 형식)
 * 		리턴값(데이터형) 메소드명(입력값...){
 			처리
 			리턴값을 돌려준다
 			return 리턴값 > void일경우에는 생략이 가능하다.
  }
  		호출 ==>  메소드명(입력값)
  		
  		결과값   입력값
  		=========
  		 o	  o
  		 o	  o
  		 x	  o
  		 x	  x	  void X()
  		 			==> void main()
  		 				double random()
  		 				int indexOf(문자) 내가찾는문자가 몇번쨰있는지 찾는 메소드
  		 				
  		 
  		 
 */
import java.util.Scanner;
public class 메소드 {
	//매개변수(사용자입력값),리턴형(결과값)
	static int plus(int a, int b){
		int c=a+b;
	
		return c;
	}
	static int minus(int a, int b){
		int c=a-b;
	
		return c;
	}
	static int gop(int a,int b){
		int c= a*b;
	
		return c;
	}
	static double div(int a,int b){
		double d=a/(double)b;
		return d;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.format("1정수를입력하시오:");
		int a = scan.nextInt();

		System.out.format("2정수를입력하시오:");
		int b = scan.nextInt();
		int res =plus(a,b);
		System.out.println(res);
}
		
	}
		

