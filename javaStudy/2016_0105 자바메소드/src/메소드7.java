import java.util.Scanner;
//단을 입력받아 구구단출력
/*
 * 단을입력 == 정수값 저장(리턴형)
 * 구구단 출력== 저장된 정수(매개변수 5){}
 */
public class 메소드7 {
	static int danInput(){
		return(int)(Math.random()*8)+2;//2~9
	}
	static void guguDan(int dan){
		for(int i=1; i<=9; i++){
			System.out.format("%d*%d=%d\n",dan,i,dan*i);
		}
		
	}
	public static void main(String[] args) {
		int dan = danInput();
		guguDan(dan);
	}

}
