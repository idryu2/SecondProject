/*
 * 		��� : ���α׷��� �°� ��� �ϴ� ���α׷�
 * 		���ǹ�
 * 			���� if��
 * 		1) ����
 * 		= if(����) {
 * 			���� }    == ������ true�� �����ϰ� false�� ��Ϲ����� ������.
 * 
 * 		= ���� �������.
 * 		  if(����){
 * 			����1
 * 			����2 
 * 		}
 * 		****** �ڹٿ��� ����� {}�̾���
 * 			       ��쿡 �ٷιؿ��ִ� ���� 1���� ����
 * 		= ���ǹ��� true, false�϶� �ٸ� ������ ����
 * 		 if(����){2
 * 			����1
 * 			else{
 * 			����2}
 * 		}
 *
 * 
 * 
 */
import java.util.Scanner;
//keyboard �Է°��� �޴°��
public class ���ǹ�1 {

	public static void main(String[] args) {
		// ����  Math.random() == 0.0 ~0.99
		//int rand = (int)(Math.random()*100)+1;
		//System.out.println("random" +rand);
	/*	Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�.");
		int num = scan.nextInt();
		System.out.println(num);*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("����(0) ����(1) ��(2) �Է�:");
		int user = scan.nextInt();
		int com = (int)(Math.random()*3);

		if (user==0)System.out.println("������ �½��ϴ�");
		if (user==1)System.out.println("�������½��ϴ�");
		if (user==2)System.out.println("�����½��ϴ�.");
		
		if (com==0)System.out.println("��ǻ�ʹ� ����");
		if (com==1)System.out.println("��ǻ�ʹ� ����");
		if (com==2)System.out.println("��ǻ�ʹ� ��");
		
		if(user ==0){
			if(com==0) System.out.println("�����ϴ�");
			if(com==1) System.out.println("����������ϴ�");
			if(com==2) System.out.println("������̰���ϴ�");
		}
		if (user==1){
			if(com==0) System.out.println("����� �̰���ϴ�");
			if(com==1) System.out.println("�����ϴ�");
			if(com==2) System.out.println("����������ϴ�");
		}
		if (user ==2){
			if(com==0) System.out.println("����������ϴ�");
			if(com==1) System.out.println("����� �̰���ϴ�.");
			if(com==2) System.out.println("�����ϴ�");
		}
/*
			int res = user-com;
			if(res==0) System.out.println("�����ϴ�.");
			if(res==2)System.out.println("����������ϴ�");
			if(res==1)System.out.println("������̰���ϴ�.");
	*/
		
		
	}
}
