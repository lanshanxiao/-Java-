import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;

public class CollectionTest{
	public static void main(String[] args){
		Collection c = new ArrayList();
		//���Ԫ��
		c.add("�����");
		//��Ȼ�����ﲻ�ܷŻ������͵�ֵ����Java֧���Զ�װ��
		c.add(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��" + c.size());//���2
		//ɾ��ָ��Ԫ��
		c.remove(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��" + c.size());//���1
		//�ж��Ƿ����ָ���ַ���
		System.out.println("c�����Ƿ����\"�����\"�ַ�����" + c.contains("�����"));//���true
		c.add("������Java EE��ҵӦ��ʵս");
		System.out.println("c���ϵ�Ԫ�أ�" + c);
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		System.out.println("c�����Ƿ���ȫ����books���ϣ�" + c.containsAll(books));//���false
		//��c���ϼ�ȥbooks�������Ԫ��
		c.removeAll(books);
		System.out.println("c���ϵ�Ԫ�أ�" + c);
		//ɾ��c���������е�Ԫ��
		c.clear();
		System.out.println("c���ϵ�Ԫ�أ�" + c);
		//����books������ֻʣ��c������Ҳ������Ԫ��
		books.retainAll(c);
		System.out.println("books���ϵ�Ԫ�أ�" + books);
	}
}