import java.util.*;
public class 과913 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] kor=new int[5];
		int[] eng=new int[5];
		int[] mat=new int[5];
		for(int i=0;i<5;i++){
			System.out.format("%d번째학생 국어점수를 입력하세요",i+1);
			kor[i] = scan.nextInt();
			System.out.format("%d번째학생 영어점수를 입력하세요",i+1);
			eng[i] = scan.nextInt();
			System.out.format("%d번째학생 수학점수를 입력하세요",i+1);
			mat[i] = scan.nextInt();
			
			
			
			System.out.format("%d번째 학생의 국어성적:%d 영어성적:%d 수학성적:%d 총점:%d 평균:%d\n",
					i+1,kor[i],eng[i],mat[i],kor[i]+eng[i]+mat[i],(kor[i]+eng[i]+mat[i])/3);
		}
	}

}
