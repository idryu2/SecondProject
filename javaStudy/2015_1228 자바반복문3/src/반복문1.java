/*
 * 2�� for��		1	   2	7
 * 			for(�ʱⰪ ; ���ǽ� ; ������){
 * 					3     4		6 
 * 				for(�ʱⰪ; ���ǽ�; ������){
 * 				���๮�� 5		}
 * 				}
 * 					1-2-(3-4-5-6,4-5-6///4(false�� 7������ �ö�)
 * 						2���� false�� ����.	
 * 
 * 		
 * 
 */
public class �ݺ���1 {

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
	

