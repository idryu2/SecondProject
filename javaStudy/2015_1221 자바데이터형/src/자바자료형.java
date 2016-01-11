		/*
		 * 자료형
		 * 
		 * 정수형
		 * 		byte   2^7
		 * 		short 2^15
		 *		 int +- 2^31
 		 * 		long +- 2^63
 		 * 			***********int vs long ==100L 로구분 
 		 * 
		 * 실수형
		 * float 소수점 6자리
		 * 
		 * double 소수점 15자리
		 * === Default값은 double
		 ***********float vs double ==== 10.5F 로구분
		 * 문자형
		 * char형   문자 한개를 표현
		 * 0~65535 ==각국의 언어를 표현가능= 유니코드
		 *  
		 * 
		 * 논리형
		 * Boolean  = true false
		  == 조건문에 주로 나옴.
		  
		  ===================> 데이터 형식에서 크기를 결정할때 사용한다.
		  ===> 데이터 저장방법.
		 *1.단일데이터 저장하는 메모리는 변수.
		       변수 = 변할수있는 값
		  		변수사용법 = 메모리 크기선언 변수명 설정  = 값
		  				int a = 10;과같음.
		  				같은 블럭{} 상에 같은 이름의 변수사용불가
		  				선언후에 나중에 값을 대입
		  				ex> int a;
		  				a =10;
		 				int a,b,c;
		 				int a=10,b=20,c=30; 			
		 *		변수명 만들기(식별자)
		 			1)알파벳이나 한글로 시작
		 			2)숫자사용가능
		 			3)특수문자사용가능		
		 			4)키워드는 사용불가.
		 ************************ 네이밍 방법  ***************************
		  		1)클래스명은 첫알파벳이 대문자.
		   		2)변수나 메소드는 첫자는 소문자.
		   		3)2개이상 단어를이용할때 두번째 시작은 대문자.
		 *   ===> 자료형의 변환
		  			자료형의크기
		  		byte - short - int - long - float - double
		 *   ===> 자료형 작게 만든다.
		    (int)10.5 = double =>int
		    강제형변환
		 *   ===> 자료형 크게만든다.
				(double)10 => int => double
				자동형변환
				
				
				
	 	  
		  */					
public class 자바자료형 {	
	
	public static void main(String[] args) {
		byte byteValue = 127;
		short shortValue = 32767;
		int intValue = 2147483647;
		long longValue = 3000000000900000000L;
		float floatValue = 10.5F;
		double doubleValue = 10.5;
		char charValue = '홍';
		boolean booleanValue = true;
		
		System.out.println("값 = " + byteValue);
		System.out.println("값 = " + shortValue);
		System.out.println("값 = " + intValue);
		System.out.println("값 = " + longValue);
		System.out.println("값 = " + floatValue);
		System.out.println("값 = " + doubleValue);
		System.out.println("값 = " + charValue);
		System.out.println("값 = " + booleanValue);
		
	}

}
