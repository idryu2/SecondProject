/*
 * CharAt 문자열에서 원하는 문자를 1개 가져옴
 * 
 * String str = "abcdef";
 * char c = str.charAt(1);
 * c?b
 */
import java.util.Scanner;
public class 문자열2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("알파벳을 입력하시오");
		String data = scan.next();
		
		int count =0;
		for(int i=0;i<data.length();i++){
			char c = data.charAt(i);
			if(c=='a'||c=='A'){
				count++;
			}
		}
		System.out.println("a,A는 총 "+count+"개입니다.");
	}

}
