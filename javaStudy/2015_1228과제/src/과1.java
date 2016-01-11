import java.util.*;
public class 과1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하시오 :");
		int kor = scan.nextInt();
		
		System.out.println("영어점수를 입력하시오 :");
		int eng = scan.nextInt();
		
		System.out.println("수학점수를 입력하시오 :");
		int math = scan.nextInt();
		
		System.out.printf("국어점수는 %d입니다.\n",kor);
		System.out.printf("영어점수는 %d입니다.\n",eng);
		System.out.printf("수학점수는 %d입니다.\n",math);
		System.out.printf("총점은 %d입니다.\n",kor+eng+math);
		System.out.printf("평균은 %d입니다.",(kor+eng+math)/3);
	}

}
