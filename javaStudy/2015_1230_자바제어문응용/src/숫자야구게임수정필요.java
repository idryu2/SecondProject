/*
 * 		1. �ߺ����� ���� = int[] com
 * 		2. �Է�  		int[] user
 * 		3. �� 	 ==s,b
 * 		4. ��Ʈ s,b
 * 		5. ���� s=3
 * 
 * 
 */
import java.util.*;
public class ���ھ߱����Ӽ����ʿ� {

	public static void main(String[] args) {
		
		int[] com=new int[3];
		int[] user=new int[3];
		int s,b;
	//�ߺ����� �����߻�
		int su=0; //��������
		boolean bDash=false;
		for(int i=0;i<3;i++){
			bDash=true;
			while(bDash){
				
				su=(int)(Math.random()*9)+1;
				bDash=false;
				for(int j=0;j<i;j++){
					if(com[j]==su){
						bDash=true;
						break; //while���� ���ǹ����� �̵�
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
			System.out.print("����3���� �Է��Ͻÿ�");//������Է�
			
			int input=scan.nextInt();//��
			//����ó��
			if(input<100||input>999){
				System.out.println("�߸����Է��Դϴ�.\n���� 3���� �Է��Ͻÿ�");
				continue;/*	for���϶��� ������, while�̸� ���ǽ�
				 				*/
			}
			user[0]=input/100;
			user[1]=(input&100)/10;
			user[2]=input%10;
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2]){
				System.out.println("�ߺ��� ���� ����Ҽ�����.");
				continue;
			}
			if(user[0]==0||user[1]==0||user[2]==0){
				System.out.println("0�� ����Ҽ�����");
				continue;
			}
		s=0;
		b=0;
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(com[i]==user[j]){//�� = ���� �����ִٸ�
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
			//��Ʈ�����
			//����
		}
	}

}
