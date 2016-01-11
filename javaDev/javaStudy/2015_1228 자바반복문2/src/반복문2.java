/*
 * 	while문
 * 단을 입력받아서  해당단을 출력
 * 입력값	
 */
import java.util.*;
public class 반복문2 {

	public static void main(String[] args) {
			//단을 입력해라
			//단을 받는다
			Scanner scan = new Scanner(System.in);
			System.out.println("단을 입력하시오");
			int dan = scan.nextInt();
			//단을 받아 구구단출력
		/*	
			int i = 1;
			while(i<=9){
				System.out.println(dan*i);
				i++;
			}
		*/	

		int i = 1;
		do{
			System.out.println(i*dan);
			i++;
		}
		while(i<10);
			/*
			   int i =10;
			  
			 if(i==10){
			 int j =20;
			 
			 if(j==20){
			  	int k = 30;
			  	//k
			  	}
			 //j
			  }
			 //i
			 */
			 
		
		
			
		
	}

}
