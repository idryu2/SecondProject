import java.util.*;
public class ��913 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] kor=new int[5];
		int[] eng=new int[5];
		int[] mat=new int[5];
		for(int i=0;i<5;i++){
			System.out.format("%d��°�л� ���������� �Է��ϼ���",i+1);
			kor[i] = scan.nextInt();
			System.out.format("%d��°�л� ���������� �Է��ϼ���",i+1);
			eng[i] = scan.nextInt();
			System.out.format("%d��°�л� ���������� �Է��ϼ���",i+1);
			mat[i] = scan.nextInt();
			
			
			
			System.out.format("%d��° �л��� �����:%d �����:%d ���м���:%d ����:%d ���:%d\n",
					i+1,kor[i],eng[i],mat[i],kor[i]+eng[i]+mat[i],(kor[i]+eng[i]+mat[i])/3);
		}
	}

}
