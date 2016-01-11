/*
 * 	변수: 저장된 데이터의 메모리 주소별칭
 * 		단일 데이터 저장가능
 * 		변수는 변경해서 사용이 가능하다.
 * =========================== 데이터 저장방법
 * 처리
 *  = 연산자
 *  	=단항연산자 	++	 --	 ! 
 *  	=산술연산자 	+	-	/	%	*
 *  	=논리연산자	&&	||
 *  	=관계연산자	==	!=	<	>	<=	>=
 *  	=대입연산자	=	+=	-=
 *  
 *  = 제어문
 *  	=조건문  if , if ~else, if ~else if...else
 *  	=선택문	switch ~ case
 *  	=반복문	for , while
 *  	=반복제어문	break , continue
 *  
 *  ====break, continue
 *  break : 반복수행을 중단
 *  continue : 특정부분을 제외할때
 *  for에서는 증가식
 *  while 에서는 조건식
 *  
 *  
 */
//숫자 야구게임
/*
 * 3 4 5
 * 		=123인풋했을때  0s-1b
 * 		=456 0s 2b
 * 		=354 1s 2b
 * 		=345 3s 0b break;
 *
 *1. 난수발생 ===숫자 3개저장
 *2. 입력요청 === 사용자가 3개숫자입력
 *3. 입력값과 난수값 비교
 *4. 힌트제공
 *5. 3s가 나왔는지 확인=안나오면 2로전송. 맞으면 break;
 */
import java.util.Scanner;
public class 수정본 {

	public static void main(String[] args) {
		int s=0;
		int b=0;
		int[] com = {7,5,8};
		int[] user = new int[3];
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("세자리 정수를 입력하시오");
			int input = scan.nextInt();
			
			if(input<100 || input>999){
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]= input%10;
			
			if(user[0]==user[1]||user[1]==user[2]){
				System.out.println("중복된 수는 사용할수없다.");
				continue;
			}
			
		
			for(int i=0;i<3;i++){ //com
				for(int a=0;a<3;a++){ //user
					if(com[i]==user[a]){
						if(i==a)
						s+=1;
						else
							b+=1;
					}
				}
			}
			System.out.format("Input Number:%d,result:%dS-%dB\n",input,s,b);//결과출력
			System.out.println("=====================");
			System.out.println("=====================");
		if(s==3){
			System.out.println("\"게임아웃\"");
		break;
		}
		}
	}


}