//1~100까지 3의배수를구하고 3의배수의 합을구해라
public class 과910 {

	public static void main(String[] args) {
		int i=1;
		int val =0;
		do{
		if(i%3==0){
			val+=i;
		System.out.print(i+" ");	
		}
		i++;
		}
		
		while(i<=100);
		System.out.println("\n합:"+val);
	}
}
		/*int i=3;
		do{
			System.out.print(i+" ");
			i+=3;
		}	 
		while(i<50);
		
		
			
		}
		
	}*/


