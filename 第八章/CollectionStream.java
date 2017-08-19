import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Stream;

public class CollectionStream{
	public static void main(String[] args){
		//����books���ϡ�Ϊbooks�������Ԫ�صĴ���
		Collection books = new HashSet();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���IOS����"));
		books.add(new String("���Ajax����"));
		books.add(new String("���Android����"));
		//ͳ�������а���������Ӵ���ͼ������
		System.out.println(books.stream().filter(ele -> ((String) ele).contains("���")).count());
		//ͳ�������а�����Java���Ӵ���ͼ������
		System.out.println(books.stream().filter(ele -> ((String) ele).contains("Java")).count());
		//ͳ���������ȴ���10��ͼ������
		System.out.println(books.stream().filter(ele -> ((String) ele).length() > 10).count());
		//�ȵ���Collection�����stream()����������ת��ΪStream
		//�ٵ���Stream��mapToInt()������ȡԭ�е�Stream��Ӧ��IntStream
		books.stream().mapToInt(ele -> ((String) ele).length()).forEach(System.out::println);//���8 11 16 7 8
	}
}