/*
 * 5���ǰ��¤� �����ϰ�
 * ����� ������� ó��(���Ĥ�)  DESC,ASC
 * 
 * �������� (# �Խ��Ǹ��鶧)
 * 
 */
public class �迭2 {

	public static void main(String[] args) {
		int[] arr = {45,56,73,34,21};
		System.out.println("������:");
		for(int i=0;i<5;i++){
			System.out.print(arr[i]+" ");
		
		}
		System.out.println("\n");
		System.out.println("������:");
		for(int i=0; i<4; i++){
			for(int j=i+1; j<5; j++){
				if(arr[i] > arr[j]){
					int temp=arr[i];
				
					arr[i] =arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<5;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
