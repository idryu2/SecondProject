/*
 * 1~10난수 발생 = 중복없는 난수발생
 * 1 =  난수발생
 * 2 =  난수 중복이있는지 여부확인
 * 3 =	중복 0 =  난수발생
 *      중복X = 저장
 * 
 * 1) 10개 변수  = 배열
 * 2) 난수저장
 * 3) 중복체크
 * 4) 
 */
public class 중복없는난수 {

	public static void main(String[] args) {
		//중복없는 데이터를 저장하는 변수
		int[] arr = new int[10];//난수
		int su=0;//중복여부 확인
		
		for(int i=0; i<=10;i++){
			boolean dDash = true;
		//중복이 없는 난수가 발생할때까지 루프
			while(true){
				//난수발생
				su=(int)(Math.random()*10)+1;
				
				dDash=false;//중복체크
				
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
		//출력
		for(int i=0;i<10;i++){
			System.out.print(arr[i]+" ");
		}
		}
		
	}

