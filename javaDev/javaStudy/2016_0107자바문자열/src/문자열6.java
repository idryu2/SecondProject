//trim 좌우 공백제거
public class 문자열6 {

	public static void main(String[] args) {
		String str = new String(" Hello java ");
		
		System.out.println(str.length());
		str =str.trim();
		System.out.println(str);
		System.out.println(str.length());
	}

}
