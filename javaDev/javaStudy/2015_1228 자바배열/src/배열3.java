//난수를 발생 5 == 최대값 최소값
/*
 * --------------------------
 * 
 *   0   0   0   0   0
 * 
 * --------------------------
 */
public class 배열3 {

	public static void main(String[] args) {
		int[] score = new int[5];
		for(int i=0; i<score.length; i++){
			score[i]=(int)(Math.random()*100)+1;
		}

		int max = 0;
		int min = 100;
		for(int i=0;i<score.length;i++){
			if(max<score[i]){
				max = score[i];
			}
			if(min>score[i]){
				min = score[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
