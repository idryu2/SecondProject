import java.util.*;
public class ��5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print(" ���������� �Է��Ͻÿ�= ");
		int a=scan.nextInt();
		System.out.print(" ���������� �Է��Ͻÿ�= ");
		int b=scan.nextInt();
		
		int c=(a+b)/2;
		char d;
		if(c>=90){
			d='A';
		}
		else if(c>=80){
			d='B';
		}
		else if(c>=70){
			d='C';
		}
		else if(c>=60){
			d='D';
		}
		else d='F';
		System.out.format("����� ���������� %d�̰�\n          ����������%d�̸� ������ %c�Դϴ�.",a,b,d);
	}

}
