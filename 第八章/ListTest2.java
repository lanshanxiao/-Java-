import java.util.ArrayList;
import java.util.List;

class A{
	public boolean equals(Object obj){
		return true;
	}
}

public class ListTest2{
	public static void main(String[] args){
		List books = new ArrayList();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���Android����"));
		System.out.println(books);
		//ɾ�������е�A���󣬽����µ�һ��Ԫ�ر�ɾ��
		books.remove(new A());
		System.out.println(books);
		//ɾ�������е�A�����ٴ�ɾ�������еĵ�һ��Ԫ��
		books.remove(new A());
		System.out.println(books);
	}
}