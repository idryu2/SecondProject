/*
 * up - down����
 */
import java.util.*;
public class �ݺ���3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//������ ������ �߻� == 1~100
		
		int count = 0;
		int com = (int)(Math.random()*100)+1; 
		// 0.0~0.99 == 0.0~99.0 == 0~99 == 1~100
		for(;;){ // ���ѷ���
			count++;
			System.out.println("1~100������ ������ �ϳ��� �Է��Ͻÿ�");
			int user = scan.nextInt();
			if(user<1 || user >100){
				System.out.println("�ٽ��Է��Ͻÿ�");
				continue;//�ٽý���.
			}
			if(user > com){
				System.out.println("���� �ʹ�Ů�ϴ�");
			}
				else if(user<com){
					System.out.println("���� �ʹ��۽��ϴ�");
				}
				else{
					System.out.println("�����Դϴ�. ������Է��Ѽ��� = "+ user);
					System.out.println("ã�µ�"+count+"���̳� �ɷȽ��ϴ�.");
				break;
				}
			
				
			}
		
	}

}
