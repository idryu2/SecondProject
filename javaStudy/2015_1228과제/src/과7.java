/*
 * 1~50 == 5의 배수, 5의 배수의 합
 * 
 */
public class 과7 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=50;i++){
			if(i%5==0){
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println("\n1~50까지 5의배수의합="+sum);
	}

}
