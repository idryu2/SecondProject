/*
 * 1~100 ¦���� ������ �, Ȧ���� ������ �  
 */
public class ��3 {

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
		System.out.format("¦������ %d�̰� \nȦ������ %d�Դϴ�.",sum1,sum2);
	}

}
