/*
 * 
 * 
 */
import java.util.Scanner;
public class ���ǹ�4 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("���������Է� :");
		int kor = scan.nextInt();
		System.out.println("���������Է�:");
		int math = scan.nextInt();
		System.out.println("���������Է� :");
		int eng = scan.nextInt();
	
		int tot = kor+eng+math;
		double avg = tot/3.0;
		System.out.println("������"+tot);
		System.out.printf("���: %.2f\n",avg);
		
	if(kor>= 90 && kor<100)
		System.out.println("��������:A");
	if(kor>=80 && kor<90)
		System.out.println("�������� :B");
	if(kor>=70 && kor<80)
	System.out.println("�������� :C");	
	
	}
	

}
