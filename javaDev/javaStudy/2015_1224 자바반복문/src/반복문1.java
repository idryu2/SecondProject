/*
 * 
 * 자바 == 반복문
 * for : 반복횟수가 지정 된 경우에 주로사용(후조치
 * while : 반복획수가 지정되지않는경우(후조치
 * do~while : 무조건 1번이상 실행.(선조치 

 *			#for 문
 *		형식		1	  2		4
 *			for(초기값; 조건식; 증가식){
 *			3	}
 *		실행순서	1	-	2	-	3	-	4	-	2	-	3	-	4
 *			
 *
 *
 */

public class 반복문1 {

	public static void main(String[] args) {
	
		for(int i=1; i<=10; i++){
			System.out.println(i);
			for(int a =1; a<=5; a++){
				System.out.println(a);
				
			}
			
		}
	}

}
