
/*
 * �ݺ���
 * = for : ����ȹ��
 * 
 *		for(�ʱⰪ; ���ǽ� ; ������){}
 *     for(;;)  ���ѷ���  (break)
 * = while : ������ ���� ȹ��
 * 			�ʱⰪ ====1
 * 			while(���ǽ�){ ====2
 * 				���๮��;	====3		
 * 				������;====4	}
 * 
 * = do~while : �ѹ��̻����
 * 		�ʱⰪ 
 * 		do{ 
 * 		���๮�� ;	
 * 		������   }
 * 		while(����);
 * 			
 * 
 * 
 */
public class �ݺ���1 {
	public static void main(String[] args){
		System.out.println("for�� ����");
		for(int i = 1; i<=10; i++){
			System.out.print(i+"\t");
			
		}
		System.out.println();
		System.out.println("while �� ����");
		int i = 1;
		while(i<=10){
			System.out.print(i+"\t");
			i++;
		}
		
		System.out.println();
		System.out.println("Do���Ϲ� ����");
		i=500;
		do{
			System.out.print(i+"\t");
			i++;
		}
		while(i<=10);
	
	}
}
