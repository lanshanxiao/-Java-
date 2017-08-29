import java.net.URLEncoder;
import java.net.URLDecoder;

public class URLDecoderTest{
	public static void main(String[] args) throws Exception{
		//½«application/x-www-form-urlencoded×Ö·û´®
		//×ª»»³ÉÆÕÍ¨×Ö·û´®
		String keyWord = URLDecoder.decode("%E7%96%AF%E7%8B%82java", "utf-8");
		System.out.println(keyWord);
		//½«ÆÕÍ¨×Ö·û´®×ª»»³É
		//application/x-www-form-urlencoded×Ö·û´®
		String urlStr = URLEncoder.encode("·è¿ñAndroid½²Òå", "GBK");
		System.out.println(urlStr);
	}
}