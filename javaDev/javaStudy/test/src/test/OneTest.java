package test;

public class OneTest {

	public static void main(String[] args) {
		
		final int setnum = 278970;
		
		System.out.println("10000원권 = "+(setnum/10000));
		System.out.println("5000원권="+((setnum%10000)/5000));
		System.out.println("1000원권 ="+(((setnum%10000)%5000)/1000));
		System.out.println("500원권="+(((setnum%10000)%5000)%1000)/500);
		System.out.println("100원권 = "+((((setnum%10000)%5000)%1000)%500)/100);
		
		int a = ((((setnum%10000)%5000)%1000)%500)%100;
		System.out.println("50원권 = "+a/50);
		System.out.println("10원권 ="+ (a%50)/10);
		
	
		

	}

}
