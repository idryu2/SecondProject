package test;
import java.util.*;
public class Six_Test {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���̸� �Է��Ͻÿ�");
		int age = scan.nextInt();
		
		if(age>19){
			System.out.println("��ȭ�� �����Ҽ��ֽ��ϴ�");
		}
		else if(age>15 && age<20){
			System.out.println("������ �����ϸ� ��ȭ�� �����Ҽ��ֽ��ϴ�");
		}
		else 
			System.out.println("��ȭ�� �����Ҽ������ϴ�.");
		
		
	}

}
