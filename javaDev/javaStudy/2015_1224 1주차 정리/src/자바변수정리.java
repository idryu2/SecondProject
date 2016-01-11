
/*
 *  변수 : 변경가능한값
   = 단일데이터변수
   =여러개 저장변수(배열,클래스)
   
 *  1)변수 형식
   데이터형(자료형) 변수명 = 값
   ----------
   byte int long
   double
   char string
   boolean
   
 *  변수생성법
   알파벳이나 한글로 시작
   맨앞에 숫자를 사용X
   특정 
   키워드 금지

 *2.데이터크기 byte char int long double
 *
 *3.형변환
 *int a = 300;
 *int b = 300;
 *byte c = byte(a+b);
 *
 */

public class 자바변수정리 {

	public static void main(String[] args) {


		int a =300;
		int b = 300;
		byte c = (byte)(a+b);
		System.out.println(c);
	}

}
