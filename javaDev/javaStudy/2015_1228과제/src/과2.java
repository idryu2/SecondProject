import java.util.Scanner;

public class ��2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int num = scan.nextInt();
		
		if(num%2==0){
			System.out.printf("%d ¦��",num);
		}
		else System.out.printf("%d Ȧ��",num);
		
	}

}
