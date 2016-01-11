/*
 * 
 * 자료형 : 메모리 크기 ====> 데이터 저장시마다 메모리 크기를 결정
 * (1,2,4,8byte)
 * 
 * 1. 정수저장
 * 		byte  1byte
 * 		short 2 3만
 * 		in t	  4 21억 default
 * 		long  8
 * 
 * 2. 실수저장
 * 		float   4   10.5F   소숫점 6자리
 * 		double  8 default   소숫점 15자리
 * 
 * 
 * 3. 문자저장  2바이트
 *		-값이 없다. 0~65535
 *    싱글바이트 1바이트 = 아스키코드
 *    멀티바이트 2바이트 = 유니   코드
 *    char
 *    
 *    
 * 4. 논리저장
 * 		boolean = true, false		
 * 
 * 
 * 	
 * 5. 참조 ====> 클래스,배열
 * 		나배 
 * 
 * 
 * 
 * 
 * 
 */
public class 자바자료형 {
	public static void main(String[] args){
		int a = 2140000000;
		double d = 123456.78;
		double i = (double)((d-123456)*100);
	System.out.println((int)'A');
	System.out.println((char)67);
	System.out.println((int)' ');
	System.out.println((char)65);
	}


}
