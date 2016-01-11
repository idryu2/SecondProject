import java.util.*;
//중복없는 난수발생
//맞은숫자
public class 숙제1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] com= new int[6];
		int[] user = new int[6];
		
		for(int i=0;i<6;i++){
			com[i] =(int)(Math.random()*45)+1;
			System.out.print("1~45까지 정수입력: ");
			int no=scan.nextInt();
			if(no<1||no>45){
				System.out.println("1~45까지의 정수만 입력하시오");
				i--;
				continue;
			}
			user[i]=no;		
		}
			System.out.print("로또 당첨번호");
			for(int i=0; i<6;i++){
				System.out.print(com[i] + " ");
			}
			
			System.out.print(" 본입 입력값");
			for(int i=0;i<6;i++){
				System.out.print(user[i]+" ");
			}
		System.out.println();
		int count=0;
		for(int i=0; i<6;i++){
			for(int k=0;k<6;k++){
				if(com[i]==user[k]){
					count++;
				}
			}
		}
		switch(count){
		case 0:
		case 1:
		case 2:
			System.out.println("꽝");
			break;
		case 3:System.out.println("4등");
		break;
		case 4:System.out.println("3등");
		break;
		case 5:System.out.println("2등");
		break;
			
		case 6:System.out.println("1등");
		break;
		}
		
	}

}
