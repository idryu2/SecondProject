/*
 * ������� �޾Ƽ� �ش������ ���.
 * 1. ��������
 * 2. �ʳ��� 1.1.1 ==  2015.12.28 = %7
 * 
 */
import java.util.*;
public class �迭4 {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.print("���Է�:");
	 int year = scan.nextInt();
	 System.out.print("���Է�:");
	 int mon = scan.nextInt();
	 System.out.print("���Է�:");
	 int day = scan.nextInt();
	
	int tot=(year-1)*365
			+(year-1)/4
			-(year-1)/100
			+(year-1)/400;
	
	int[] lastDay={31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0 && year%100!=0)||(year%400==0)){
			lastDay[1]=29;
		}
		else 
			lastDay[1]=28;
		//2015 12 28
	for(int i=0; i<mon-1;i++){
		tot+=lastDay[i];
	}
	
	tot+=day;
	int week = tot%7;
	char[] strWeek = {'��','��','ȭ','��','��','��','��'};
	System.out.println(strWeek[week]+"����");
	/*switch(week){
	case 0: System.out.println("�Ͽ���");
	break;
	case 1: System.out.println("������");
	break;
	case 2: System.out.println("ȭ����");
	break;
	case 3:System.out.println("������");
	break;
	case 4:System.out.println("�����");
	break;
	case 5:System.out.println("�ݿ���");
	break;
	case 6: System.out.println("�����");
	break;
	}*/
	
	
	}
}
