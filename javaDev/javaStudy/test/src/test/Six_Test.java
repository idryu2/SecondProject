package test;
import java.util.*;
public class Six_Test {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력하시오");
		int age = scan.nextInt();
		
		if(age>19){
			System.out.println("영화를 관람할수있습니다");
		}
		else if(age>15 && age<20){
			System.out.println("성인을 동반하면 영화를 관람할수있습니다");
		}
		else 
			System.out.println("영화를 관람할수없습니다.");
		
		
	}

}
