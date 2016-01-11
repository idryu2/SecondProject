/*
 * startsWith	== boolean
 * endsWith ===boolean
 */
import java.util.Scanner;
public class 문자열3 {

	public static void main(String[] args) {
			String[] data = {"java program","java and jsp","ajax and html", "oracle and java"};
			Scanner scan = new Scanner(System.in);
			System.out.print("검색어:");
			String find= scan.next();
			for(int i=0; i<data.length; i++){
			if(find.startsWith(find)){
				System.out.println(data);
			}
	}

}
}
