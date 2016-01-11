/*
 * 2차 for문		1	   2	7
 * 			for(초기값 ; 조건식 ; 증가식){
 * 					3     4		6 
 * 				for(초기값; 조건식; 증가식){
 * 				실행문장 5		}
 * 				}
 * 					1-2-(3-4-5-6,4-5-6///4(false면 7번으로 올라감)
 * 						2번이 false면 종료.	
 * 
 * 		
 * 
 */
public class 반복문1 {

	public static void main(String[] args) {

			for(int i=1;i<=4;i++){
				System.out.print(" ");
			
				for(int j=1; j<=5-i;j++){
					System.out.print(" ");
				}
					for(int a=1; a<=i-1;a++){
						System.out.println("*");
					}
					System.out.println();
						
			}
					
				
			}
	

			}
	

