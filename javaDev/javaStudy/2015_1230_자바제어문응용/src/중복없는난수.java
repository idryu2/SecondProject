/*
 * 1~10���� �߻� = �ߺ����� �����߻�
 * 1 =  �����߻�
 * 2 =  ���� �ߺ����ִ��� ����Ȯ��
 * 3 =	�ߺ� 0 =  �����߻�
 *      �ߺ�X = ����
 * 
 * 1) 10�� ����  = �迭
 * 2) ��������
 * 3) �ߺ�üũ
 * 4) 
 */
public class �ߺ����³��� {

	public static void main(String[] args) {
		//�ߺ����� �����͸� �����ϴ� ����
		int[] arr = new int[10];//����
		int su=0;//�ߺ����� Ȯ��
		
		for(int i=0; i<=10;i++){
			boolean dDash = true;
		//�ߺ��� ���� ������ �߻��Ҷ����� ����
			while(true){
				//�����߻�
				su=(int)(Math.random()*10)+1;
				
				dDash=false;//�ߺ�üũ
				
				for(int a=1; a<i; a++){
					if(arr[a]==su){
						dDash = true;
						break;
					}
					else{
						dDash = false;
						break;
					}
					
					
					}			
				arr[i]=su;
				}

		}
		//���
		for(int i=0;i<10;i++){
			System.out.print(arr[i]+" ");
		}
		}
		
	}

