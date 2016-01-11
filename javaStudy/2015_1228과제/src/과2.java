import java.util.Scanner;

public class 과2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = scan.nextInt();
		
		if(num%2==0){
			System.out.printf("%d 짝수",num);
		}
		else System.out.printf("%d 홀수",num);
		
	}

}
