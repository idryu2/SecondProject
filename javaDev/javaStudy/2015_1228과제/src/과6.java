import java.util.Scanner;

public class ��6 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print(" ���������� �Է��Ͻÿ�= ");
		int kor=scan.nextInt();
		System.out.print(" ���������� �Է��Ͻÿ�= ");
		int eng=scan.nextInt();
	
		int avg = (kor+eng)/2;
		char a;
		if(avg>=90)a='A';
		else if(avg>=80)a='B';
		else if(avg>=70) a='C';
		else if(avg>=60)a='D';
		else a='F';
		switch(a){
		case 'A': System.out.println(a);;
		break;
		case 'B': System.out.println(a);;
		break;
		case 'C': System.out.println(a);;
		break;
		case 'D': System.out.println(a);;
		break;
		default: System.out.println(a);;
		}
		
	

	}

}