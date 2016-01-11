/*
 * up - down게임
 */
import java.util.*;
public class 반복문3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//임의의 난수를 발생 == 1~100
		
		int count = 0;
		int com = (int)(Math.random()*100)+1; 
		// 0.0~0.99 == 0.0~99.0 == 0~99 == 1~100
		for(;;){ // 무한루프
			count++;
			System.out.println("1~100까지의 정수중 하나를 입력하시오");
			int user = scan.nextInt();
			if(user<1 || user >100){
				System.out.println("다시입력하시오");
				continue;//다시시작.
			}
			if(user > com){
				System.out.println("값이 너무큽니다");
			}
				else if(user<com){
					System.out.println("값이 너무작습니다");
				}
				else{
					System.out.println("정답입니다. 당신이입력한수는 = "+ user);
					System.out.println("찾는데"+count+"번이나 걸렸습니다.");
				break;
				}
			
				
			}
		
	}

}
