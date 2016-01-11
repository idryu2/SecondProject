import java.util.*;
public class 학점계산 {

	public static void main(String[] args) {
		char[] dap = new char[10];
		char[] user = new char[10];
		for(int i=0; i<10;i++){
			int rnd=(int)(Math.random()*2);
			if(rnd==0) dap[i]='O';
			else dap[i]='X';		
		}
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<10;i++){
			System.out.print("0,1=");
			int num= scan.nextInt();
			if(num==0){
				user[i] = 'O';
			}
			else if(num==1){
				user[i] = 'X';
				
			}
			else user[i] = 'X';
			
		}
		int count =0;
		for(int i=0;i<10;i++){
			if(dap[i]==user[i]){
				count++;
				
			}
			System.out.println();
			System.out.print("점수"+(count*10));
			char hak='A';
			switch(count){
			case 10:
			case 9: hak='A';
			break;
			case 8:
			case 7: hak='B';
			break;
			case 6:
			case 5: hak='C';
			break;
			case 4:
			case 3: hak= 'D';
			}
		}
		
	}

}
