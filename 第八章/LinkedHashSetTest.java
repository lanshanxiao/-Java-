import java.util.LinkedHashSet;

public class LinkedHashSetTest{
	public static void main(String[] args){
		LinkedHashSet books = new LinkedHashSet();
		books.add("���Java����");
		books.add("������Java EE��ҵӦ��ʵս");
		System.out.println(books);
		//ɾ�� ���Java����
		books.remove("���Java����");
		//������� ���Java����
		books.add("���Java����");
		System.out.println(books);
	}
}