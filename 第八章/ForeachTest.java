import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;

public class ForeachTest{
	public static void main(String[] args){
		//�������ϡ����Ԫ�صĴ�����ǰһ��������ͬ
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���Android����");
		for(Object obj : books){
			//�˴���book����Ҳ���Ǽ���Ԫ�ر���
			String book = (String) obj;
			System.out.println(book);
			if(book.equals("���Java����")){
				//������������쳣
				books.remove(book);
			}
		}
		System.out.println(books);
	}
}