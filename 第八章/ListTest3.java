import java.util.ArrayList;
import java.util.List;

public class ListTest3{
	public static void main(String[] args){
		List books = new ArrayList();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���Android����"));
		books.add(new String("���iOS����"));
		//ʹ��Ŀ������ΪComparator��Lambda���ʽ��List��������
		books.sort((o1, o2) -> ((String) o1).length() - ((String) o2).length());
		System.out.println(books); 
		//ʹ��Ŀ������ΪUnaryOperator��Lambda���ʽ���滻����������Ԫ��
		//��Lambda���ʽ����ʹ��ÿ���ַ����ĳ�����Ϊ�µļ���Ԫ��
		books.replaceAll(ele -> ((String) ele).length());
		System.out.println(books);
	}
}