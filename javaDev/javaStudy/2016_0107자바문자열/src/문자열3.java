import java.util.Scanner;
public class 문자열3 {
	static String calc(int a,char op,int b){
		int res = 0;
		String str="";
		switch(op){
			case '+':
				res=a+b;
				str=String.valueOf(res);
				break;
			case '-':
				res = a-b;
				str=String.valueOf(res);
				break;
			case '*':
				res=a*b;
				str=String.valueOf(res);
				break;
			case '/':
				if(b==0){
				System.out.println("0으로 나눌수없습니다.");
				break;
		}
				else {
					res=a/b;
					str=String.valueOf(res);
					break;
					
				}
				
				
				
				
		}
		return str;
	}
	
				
		
	
	
	
		static void process()
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("첫번째 정수입력:");
			int a= scan.nextInt();
			
			System.out.print("연산자를 입력:");
			String op=scan.next();
			
			System.out.print("2번째 정수를 입력:");
			int b = scan.nextInt();
			String result = calc(a,op.charAt(0),b);
			System.out.println("결과"+result);
			System.out.println("다시하기(y) 그만하기(n)");
			Scanner scan2 = new Scanner(System.in);
			String st = scan2.next();
			if(st.equals("y")){
			process();
			}
			
		}
	
	public static void main(String[] args) {
		process();
		
	}

}
