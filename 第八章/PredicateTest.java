import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest{
	public static void main(String[] args){
		//����books���ϡ�Ϊbooks�������Ԫ�صĴ���
		Collection books = new HashSet();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���IOS����"));
		books.add(new String("���Ajax����"));
		books.add(new String("���Android����"));
		
		//ͳ�������а���������Ӵ���ͼ������
		System.out.println(calAll(books, ele -> ((String) ele).contains("���")));
		//ͳ�������а�����Java���Ӵ���ͼ������
		System.out.println(calAll(books, ele -> ((String) ele).contains("Java")));
		//ͳ���������ȴ���10��ͼ������
		System.out.println(calAll(books, ele -> ((String) ele).length() > 10));
	}
	
	public static int calAll(Collection books, Predicate p){
		int total = 0;
		for(Object obj : books){
			//ʹ��Predicate��test()�����жϸö����Ƿ�����ָ��������
			if(p.test(obj)){
				total ++;
			}
		}
		return total;
	}
}