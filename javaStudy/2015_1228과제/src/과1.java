import java.util.*;
public class ��1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���������� �Է��Ͻÿ� :");
		int kor = scan.nextInt();
		
		System.out.println("���������� �Է��Ͻÿ� :");
		int eng = scan.nextInt();
		
		System.out.println("���������� �Է��Ͻÿ� :");
		int math = scan.nextInt();
		
		System.out.printf("���������� %d�Դϴ�.\n",kor);
		System.out.printf("���������� %d�Դϴ�.\n",eng);
		System.out.printf("���������� %d�Դϴ�.\n",math);
		System.out.printf("������ %d�Դϴ�.\n",kor+eng+math);
		System.out.printf("����� %d�Դϴ�.",(kor+eng+math)/3);
	}

}
