import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.*;

import com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference.Elements;

public class 기타문자열 {

	public static void main(String[] args)throws Exception{
		
		
		
		Document doc = Jsoup.connect("http://movie.naver.com/movie/sdb/rank/rmovie.nhn").get();
//		System.out.println(doc);

		org.jsoup.select.Elements data=doc.select("td.title div.tit3");
		for(int i=0;i<data.size();i++){
			System.out.println(data.get(i).text());
		}
	}

}
