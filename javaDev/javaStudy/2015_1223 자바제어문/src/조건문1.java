/*
 * 		제어문 : 프로그램에 맞게 제어를 하는 프로그램
 * 		조건문
 * 			단일 if문
 * 		1) 형식
 * 		= if(조건) {
 * 			문장 }    == 조건이 true면 수행하고 false면 블록밖으로 나간다.
 * 
 * 		= 여러 문장제어문.
 * 		  if(조건){
 * 			문장1
 * 			문장2 
 * 		}
 * 		****** 자바에서 제어문은 {}이없는
 * 			       경우에 바로밑에있는 문장 1개만 제어
 * 		= 조건문이 true, false일때 다른 문장을 수행
 * 		 if(조건){2
 * 			문장1
 * 			else{
 * 			문장2}
 * 		}
 *
 * 
 * 
 */
import java.util.Scanner;
//keyboard 입력값을 받는경우
public class 조건문1 {

	public static void main(String[] args) {
		// 난수  Math.random() == 0.0 ~0.99
		//int rand = (int)(Math.random()*100)+1;
		//System.out.println("random" +rand);
	/*	Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력.");
		int num = scan.nextInt();
		System.out.println(num);*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0) 바위(1) 보(2) 입력:");
		int user = scan.nextInt();
		int com = (int)(Math.random()*3);

		if (user==0)System.out.println("가위를 냈습니다");
		if (user==1)System.out.println("바위를냈습니다");
		if (user==2)System.out.println("보를냈습니다.");
		
		if (com==0)System.out.println("컴퓨터는 가위");
		if (com==1)System.out.println("컴퓨터는 바위");
		if (com==2)System.out.println("컴퓨터는 보");
		
		if(user ==0){
			if(com==0) System.out.println("비겼습니다");
			if(com==1) System.out.println("당신이졌습니다");
			if(com==2) System.out.println("당신이이겼습니다");
		}
		if (user==1){
			if(com==0) System.out.println("당신이 이겼습니다");
			if(com==1) System.out.println("비겼습니다");
			if(com==2) System.out.println("당신이졌습니다");
		}
		if (user ==2){
			if(com==0) System.out.println("당신이졌습니다");
			if(com==1) System.out.println("당신이 이겼습니다.");
			if(com==2) System.out.println("비겼습니다");
		}
/*
			int res = user-com;
			if(res==0) System.out.println("비겼습니다.");
			if(res==2)System.out.println("당신이졌습니다");
			if(res==1)System.out.println("당신이이겼습니다.");
	*/
		
		
	}
}
