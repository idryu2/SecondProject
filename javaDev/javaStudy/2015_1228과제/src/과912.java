import java.util.Scanner;

public class ��912 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		int hap=0;
		int max =0;
		int min = 100;
		
		for(int i=0;i<=9;i++){
			System.out.println("������ �Է��Ͻÿ�");
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
		System.out.format("������ %d�̰� ����� %d�̰� \n�ְ������� %d�̰� ����������%d�Դϴ�.",hap,hap/10,max,min);
	}

}
