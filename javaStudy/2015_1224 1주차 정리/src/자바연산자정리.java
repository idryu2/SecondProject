/*
 * 			단항연산자( 증감 ++,--  부정 !)
 * 1.증감연산자
 * 	전치연산
 * 	int a = 10;
 * 	int b = ++a;
 * 	a를 1개 증가후에 대입
 * 	후치연산
 * 	b = a++;
 * 	a를 b에 먼저 대입 후 a의값을 1증가시킴
 * 2. 부정연산자 (조건문)
 * 	boolean bCheck = false;
 * 	bCheck = !bCheck;
 * 	bCheck = true
 *
 *			 이항연산자
 *1. 산술연산자 (+ - * / %)
 *		형변환 = 연산시 큰데이터형으로 바뀜
 *		int + long = long 
 *		int 이하의 연산시 int 로바뀜
 *		byte + byte = int 
 *		=== 0으로나누면 error
 *			정수/정수 = 정수 (실수점 제외)
 *			%
 *			남은값은 항상 왼쪽편의 부호를 유지
 *2. 관계연산자 ==  !=  <  >  <=  >=
 *		true or false
 *		==   <=  >= 
 *3. 논리연산자
 *		&&  == 양쪽모두 true 여야 true
 *		||  == 한쪽만 true 여도 true
 *
 *4. 대입연산자
 *		int a = 10;
 *		a+1 == a=a+1;
 *		a-=1 == a=a-1; 
 * 
 * 
 * 
 */
//연도를 입력받아 윤년인지 여부를 확인하는방법
// 4년마다
// 100년마다 윤년에서 제외
// 400년마다 한번씩 윤년아
// if((year%4==0 && year%100!=0 || year%400==0))

/*
 * ##제어문
 * if (조건)
 * 형식)
 * 		if(조건){
 * 		문장1,문장2 ...
 * }
 *  {}이없는 경우에는 한문장만 제어한다.
 *  		if (조건){
 * 	 	if 조건문이 트루일때 실행
 *  }
 * 			 else {
 *  	조건문이 false 일때 실행
 *  	}
 * 	##if else문은 조건이 만족되면 조건문을 빠져나감.
 * 		if(조건){
 * }
 * 		else if(조건){
 * }
 * 		else if(조건){
 * }
 * 
 * 		else//나와도되고 안나와도된다. {
 * }
 * 
 * 
 */
import java.util.*;
public class 자바연산자정리 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도입력");
		int year = scan.nextInt();
		if((year%4 ==0 &&year%100!=0 || year%400==0)){
			System.out.println(year+"년도는 윤년입니다.");
		}
			else{ 
				System.out.println(year+"년도는 윤년이 X");
		}
		
	}

}
