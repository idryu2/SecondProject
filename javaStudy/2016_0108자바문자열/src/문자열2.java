/*
 * split �޼ҵ�
 * 
 * 
 */
public class ���ڿ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "admin,1234,����,����";
		String[] res = data.split(",");
		for(int i=0; i<res.length;i++){
			String[] title = {"ID","Pw","SEX","LOC"};
			System.out.println(title[i]+":"+res[i]);
		}
	}

}
