
/*
 * 반복문
 * = for : 지정획수
 * 
 *		for(초기값; 조건식 ; 증가식){}
 *     for(;;)  무한루프  (break)
 * = while : 지정이 없는 획수
 * 			초기값 ====1
 * 			while(조건식){ ====2
 * 				실행문장;	====3		
 * 				증가식;====4	}
 * 
 * = do~while : 한번이상수행
 * 		초기값 
 * 		do{ 
 * 		실행문장 ;	
 * 		증가식   }
 * 		while(조건);
 * 			
 * 
 * 
 */
public class 반복문1 {
	public static void main(String[] args){
		System.out.println("for문 수행");
		for(int i = 1; i<=10; i++){
			System.out.print(i+"\t");
			
		}
		System.out.println();
		System.out.println("while 문 수행");
		int i = 1;
		while(i<=10){
			System.out.print(i+"\t");
			i++;
		}
		
		System.out.println();
		System.out.println("Do와일문 실행");
		i=500;
		do{
			System.out.print(i+"\t");
			i++;
		}
		while(i<=10);
	
	}
}
