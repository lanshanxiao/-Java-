import java.util.LinkedList;

public class LinkedListTest{
	public static void main(String[] args){
		LinkedList books = new LinkedList();
		//���ַ���Ԫ�ؼ�����е�β��
		books.offer("���Java����");
		//��һ���ַ���Ԫ�ؼ���ջ�Ķ���
		books.push("������Java EE��ҵӦ��ʵս");
		//���ַ���Ԫ����ӵ����е�ͷ�����൱��ջ�Ķ�����
		books.offerFirst("���Android����");
		//��List��ʽ�����������ʵķ�ʽ������������Ԫ��
		for(int i = 0; i < books.size(); i++){
			System.out.println("�����У�" + books.get(i));
		}
		//���ʲ���ɾ��ջ����Ԫ��
		System.out.println(books.peekFirst());
		//���ʲ���ɾ�����е����һ��Ԫ��
		System.out.println(books.peekLast());
		//��ջ����Ԫ�ص���ջ
		System.out.println(books.pop());
		//������������������е�һ��Ԫ�ر�ɾ��
		System.out.println(books);
		//���ʲ�ɾ�����е����һ��Ԫ��
		System.out.println(books.pollLast());
		//���������[������Java EE��ҵӦ��ʵս]
		System.out.println(books);
	}
}