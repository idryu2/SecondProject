import java.util.*;
public class 과8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int a = scan.nextInt();
		
		for(int i=1;i<10;i++){
			System.out.format("%d*%d=%d\n",a,i,a*i);
		}
	}

}
