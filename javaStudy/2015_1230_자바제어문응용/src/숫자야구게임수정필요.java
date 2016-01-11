/*
 * 		1. 중복없는 난수 = int[] com
 * 		2. 입력  		int[] user
 * 		3. 비교 	 ==s,b
 * 		4. 힌트 s,b
 * 		5. 종료 s=3
 * 
 * 
 */
import java.util.*;
public class 숫자야구게임수정필요 {

	public static void main(String[] args) {
		
		int[] com=new int[3];
		int[] user=new int[3];
		int s,b;
	//중복없는 난수발생
		int su=0; //난수저장
		boolean bDash=false;
		for(int i=0;i<3;i++){
			bDash=true;
			while(bDash){
				
				su=(int)(Math.random()*9)+1;
				bDash=false;
				for(int j=0;j<i;j++){
					if(com[j]==su){
						bDash=true;
						break; //while문의 조건문으로 이동
					}
					else{
						bDash=false;
						break;
					}
				}
				
			}
			com[i]=su;
			
		}
		
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("숫자3개를 입력하시오");//사용자입력
			
			int input=scan.nextInt();//비교
			//오류처리
			if(input<100||input>999){
				System.out.println("잘못된입력입니다.\n숫자 3개를 입력하시오");
				continue;/*	for문일때는 증가식, while이면 조건식
				 				*/
			}
			user[0]=input/100;
			user[1]=(input&100)/10;
			user[2]=input%10;
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2]){
				System.out.println("중복된 수는 사용할수없다.");
				continue;
			}
			if(user[0]==0||user[1]==0||user[2]==0){
				System.out.println("0은 사용할수없다");
				continue;
			}
		s=0;
		b=0;
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(com[i]==user[j]){//비교 = 같은 수가있다면
						if(i==j){
							s++;
						}
						else b++;
						
					}
				}
			}
			System.out.format("Input Number:%d,Result:%dS-%dB\n",input,s,b);
			if(s==3){
				System.out.println("GameOver");
				break;
			}
			//힌트줘야지
			//종료
		}
	}

}
