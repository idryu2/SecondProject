/*
 * 	�迭
 * 		= ���� ���������� ������ ��Ƽ� ����
 * 		����(�ѿ���), �迭(����Ʈ)
 * 	=�Ϲݺ��� : ����(5)
 * 		������ 5�� int a=1, int b=2 ,int c=3, int d=4, int e=5
 * 		�迭�� 1���� �迭������ ������ ������ó��
 *     ���������� �޸𸮹�ġ(������ ����)
 *     1) ����
 *     		int[] �迭�� = {1,2,3,4,5};
 *     		��������
 * 
 */
public class �迭1 {

	public static void main(String[] args) {
		int [] arr=new int[6]; //int 6���� 0������ �ʱ�ȭ
		for(int i=0; i<6;i++){
			arr[i]=(int)(Math.random()*45)+1;
			System.out.println(i+1+"������ȣ:");
			System.out.println(arr[i]);
		}
	}


}
