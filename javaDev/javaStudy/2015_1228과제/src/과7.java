/*
 * 1~50 == 5�� ���, 5�� ����� ��
 * 
 */
public class ��7 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=50;i++){
			if(i%5==0){
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println("\n1~50���� 5�ǹ������="+sum);
	}

}
