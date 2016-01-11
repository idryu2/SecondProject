/*
 * 5개의갑승ㄹ 설정하고
 * 출력을 순서대로 처리(정렬ㄹ)  DESC,ASC
 * 
 * 선택정렬 (# 게시판만들때)
 * 
 */
public class 배열2 {

	public static void main(String[] args) {
		int[] arr = {45,56,73,34,21};
		System.out.println("정렬전:");
		for(int i=0;i<5;i++){
			System.out.print(arr[i]+" ");
		
		}
		System.out.println("\n");
		System.out.println("정렬후:");
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
