import java.util.*;

public class ���ǹ�5 {

	public static void main(String[] args) {
		//if else��
		System.out.println("1~100����������");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num<1 || num>100){
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	
		else {
			System.out.println("�ԷµȰ���:"+num);
		}
		if(num%2==0){
			System.out.println(num+"���� ¦���Դϴ�.");
		}
		else{
			System.out.println(num+"���� Ȧ���Դϴ�.");
		}
		
		

	}

}
