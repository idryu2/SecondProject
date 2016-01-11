/*
 * 
 * 1>자바 실행
 * 		A.java ====> A.class ====>실행
 * 			javac는 기계어로 변환시켜주는것         java<인터프리터>
 * 								  ==========JVM
 * 2> 자바에서 사용하는 데이터 표현법
 * 			1. 정수
 * 				====>10진법
 * 				====>8진법      0으로 시작하는 수
 * 				====>16진법     0x로 시작하는 수 
 * 
 * 			2. 문자
 * 	 		= 'A', 'a'  '0' 등등  문자마다 고유숫자를 가지고있음
 * 			  65   97   48
 * 
 * 			3. 문자열
 * 				="홍길동"
 * 
 * 			4. 실수
 * 				= 10.5(8byte)  10.5F(4byte)
 * 
 * 			5. 불린
 * 				= true, false
 * 
 * 
 * */
public class 자바기초 {

	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(011);
		System.out.println(0x55);
		
		System.out.println('A');
		System.out.println('홍');
		
		System.out.println("홍길동");
		
		System.out.println(10.5);
		System.out.println(10.5F);

		System.out.println(true);
		System.out.println(false);
		
		// 문자열 결합 (+)
		System.out.println("7"+7+"7"+7+7);
		//77777
		System.out.println(7+7+7+7+7);
		System.out.println(7+7+7+7+"7");
		
		
	}

}
