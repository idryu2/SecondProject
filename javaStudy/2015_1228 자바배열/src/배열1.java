/*
 * 	배열
 * 		= 같은 데이터형의 변수를 모아서 관리
 * 		변수(한옥집), 배열(아파트)
 * 	=일반변수 : 변수(5)
 * 		변수명 5개 int a=1, int b=2 ,int c=3, int d=4, int e=5
 * 		배열은 1개의 배열명으로 여러개 데이터처리
 *     연속적으로 메모리배치(관리가 쉽다)
 *     1) 형식
 *     		int[] 배열명 = {1,2,3,4,5};
 *     		데이터형
 * 
 */
public class 배열1 {

	public static void main(String[] args) {
		int [] arr=new int[6]; //int 6개를 0값으로 초기화
		for(int i=0; i<6;i++){
			arr[i]=(int)(Math.random()*45)+1;
			System.out.println(i+1+"번쨰번호:");
			System.out.println(arr[i]);
		}
	}


}
