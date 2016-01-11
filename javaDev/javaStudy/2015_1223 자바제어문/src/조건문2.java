import java.util.*;
public class 조건문2 {

	public static void main(String[] args) {
		
		char ch = 'A'; //char == 연산자가 드러가면 정수
		char ch1 = 'b';
		
		
		/*
		&&: 포함
		||: 범위를 벗어남
*/
		if(ch>= 'A' && ch<='Z')
			System.out.println(ch+"는 대문자다");
		if(ch1>= 'a' && ch1<='z')
			System.out.println(ch1+"는 소문자다");


	}

}
