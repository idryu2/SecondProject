/*
 * 	����: ����� �������� �޸� �ּҺ�Ī
 * 		���� ������ ���尡��
 * 		������ �����ؼ� ����� �����ϴ�.
 * =========================== ������ ������
 * ó��
 *  = ������
 *  	=���׿����� 	++	 --	 ! 
 *  	=��������� 	+	-	/	%	*
 *  	=��������	&&	||
 *  	=���迬����	==	!=	<	>	<=	>=
 *  	=���Կ�����	=	+=	-=
 *  
 *  = ���
 *  	=���ǹ�  if , if ~else, if ~else if...else
 *  	=���ù�	switch ~ case
 *  	=�ݺ���	for , while
 *  	=�ݺ����	break , continue
 *  
 *  ====break, continue
 *  break : �ݺ������� �ߴ�
 *  continue : Ư���κ��� �����Ҷ�
 *  for������ ������
 *  while ������ ���ǽ�
 *  
 *  
 */
//���� �߱�����
/*
 * 3 4 5
 * 		=123��ǲ������  0s-1b
 * 		=456 0s 2b
 * 		=354 1s 2b
 * 		=345 3s 0b break;
 *
 *1. �����߻� ===���� 3������
 *2. �Է¿�û === ����ڰ� 3�������Է�
 *3. �Է°��� ������ ��
 *4. ��Ʈ����
 *5. 3s�� ���Դ��� Ȯ��=�ȳ����� 2������. ������ break;
 */
import java.util.Scanner;
public class ������ {

	public static void main(String[] args) {
		int s=0;
		int b=0;
		int[] com = {7,5,8};
		int[] user = new int[3];
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("���ڸ� ������ �Է��Ͻÿ�");
			int input = scan.nextInt();
			
			if(input<100 || input>999){
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]= input%10;
			
			if(user[0]==user[1]||user[1]==user[2]){
				System.out.println("�ߺ��� ���� ����Ҽ�����.");
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
			System.out.format("Input Number:%d,result:%dS-%dB\n",input,s,b);//������
			System.out.println("=====================");
			System.out.println("=====================");
		if(s==3){
			System.out.println("\"���Ӿƿ�\"");
		break;
		}
		}
	}


}