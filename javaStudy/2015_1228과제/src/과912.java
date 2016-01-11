import java.util.Scanner;

public class 과912 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		int hap=0;
		int max =0;
		int min = 100;
		
		for(int i=0;i<=9;i++){
			System.out.println("점수를 입력하시오");
			num[i]=scan.nextInt();
			hap=hap+num[i];
			 
		}
		
		for(int a=0;a<num.length;a++){
			if(max<num[a]){
				max = num[a];
			}
			if(min>num[a]){
				min=num[a];
			}
			
		}
		System.out.format("총합은 %d이고 평균은 %d이고 \n최고점수는 %d이고 최저점수는%d입니다.",hap,hap/10,max,min);
	}

}
