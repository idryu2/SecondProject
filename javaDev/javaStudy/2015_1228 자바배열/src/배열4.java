/*
 * 년월일을 받아서 해당요일을 계산.
 * 1. 윤년조건
 * 2. 초날수 1.1.1 ==  2015.12.28 = %7
 * 
 */
import java.util.*;
public class 배열4 {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.print("년입력:");
	 int year = scan.nextInt();
	 System.out.print("월입력:");
	 int mon = scan.nextInt();
	 System.out.print("일입력:");
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
	char[] strWeek = {'일','월','화','수','목','금','토'};
	System.out.println(strWeek[week]+"요일");
	/*switch(week){
	case 0: System.out.println("일요일");
	break;
	case 1: System.out.println("월요일");
	break;
	case 2: System.out.println("화요일");
	break;
	case 3:System.out.println("수요일");
	break;
	case 4:System.out.println("목요일");
	break;
	case 5:System.out.println("금요일");
	break;
	case 6: System.out.println("토요일");
	break;
	}*/
	
	
	}
}
