import java.util.List;
import java.util.ArrayList;

public class GeneicTest{
	public void test(List<?> c){
		for(int i = 0; i < c.size(); i++){
			System.out.println(c.get(i));
		}
	}
	
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("���Java����");
		list.add("���Android����");
		GeneicTest gt = new GeneicTest();
		gt.test(list);
	}
}