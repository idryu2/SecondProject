import java.util.*;
public class ��911 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ ������ �Է��Ͻÿ�:");
		int num = scan.nextInt();
		
		int i=1;
		int sum=0;
		while(i<=num){
			System.out.print(i+" ");
			sum+=i;
			i++;
		}
		System.out.println();
		System.out.print(num+"������ �� ����"+sum);
	}

}

/*
int num = (int)(Math.random()*100)+1;
int sum=0;
for(int i=1;i<=num; i++){
sum+=1i;
}
System.out.println("�Է°�"+num);
System.out.println("1~"+num"������ ��:"+sum);
}
}
*/