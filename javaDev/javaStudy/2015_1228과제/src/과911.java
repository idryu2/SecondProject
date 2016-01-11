import java.util.*;
public class 과911 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("임의의 정수를 입력하시오:");
		int num = scan.nextInt();
		
		int i=1;
		int sum=0;
		while(i<=num){
			System.out.print(i+" ");
			sum+=i;
			i++;
		}
		System.out.println();
		System.out.print(num+"까지의 총 합은"+sum);
	}

}

/*
int num = (int)(Math.random()*100)+1;
int sum=0;
for(int i=1;i<=num; i++){
sum+=1i;
}
System.out.println("입력값"+num);
System.out.println("1~"+num"까지의 합:"+sum);
}
}
*/