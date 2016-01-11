import java.util.*;
public class 과9 {

	public static void main(String[] args) {
		int[] val = new int[5];
		int max = 0, min = 100;
		for(int i=0;i<5;i++){
			val[i] = (int)(Math.random()*100)+1;
			System.out.format(val[i]+" ");
		}
		System.out.println();
		for(int i=0; i<5;i++){
			if(max<val[i]){
				max=val[i];
			}
			if(min>val[i]){
				min=val[i];
			}
		}
		System.out.format("최대값:%d\n최소값:%d",max,min);
	}	
}
/*		Scanner scan =new Scanner(System.in);
		
		int[] score = new int[3];
		System.out.println("정수를 3개 입력하시오");
		score[0] = scan.nextInt();
		System.out.println("정수를 2개 입력하시오");
		score[1] = scan.nextInt();
		System.out.println("정수를 1개 입력하시오");
		score[2] = scan.nextInt();
		
		int max =0;
		for(int i=0;i<score.length;i++){
			System.out.println();
			if(max<score[i]){
				max=score[i];
			}
		}
		
System.out.println(max);
	}

}
*/