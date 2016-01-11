/*
 * 다중 조건문
 * 형식)
 if(조건){
 	문장1
 }
 else if(조건){
 	문장2 
 }
 else if(조건) {
  	문장3
 }
 else
  	문장4
 */

public class 조건문6 {

	public static void main(String[] args) {
		int js = 85;
		char hak;
		
	if(js>=90){
		hak='A';
	}
			
				else if(js>=80){
				hak= 'B';
			}

				else if(js>=70){
					hak='C';
					
				}
				else if(js>=60){
					hak='D';
					
				}
					
				else {
					hak='F';
				}
				System.out.println(hak);
	
	}

	}

