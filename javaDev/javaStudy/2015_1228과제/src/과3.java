/*
 * 1~100 짝수의 개수가 몇개, 홀수의 갯수가 몇개  
 */
public class 과3 {

	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		for(int i=0; i<=100;i++){
			if(i%2==0){
				sum1+=i;
			}
			else{
				sum2 +=i;
			}
		}
		System.out.format("짝수합은 %d이고 \n홀수합은 %d입니다.",sum1,sum2);
	}

}
