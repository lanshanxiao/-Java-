import java.util.List;
import java.util.ArrayList;

public class GenericList{
	public static void main(String[] args){
		//����һ��ֻ�뱣���ַ�����List����
		List<String> strList = new ArrayList<String>();
		strList.add("���Java����");
		strList.add("���Android����");
		//"��С��"��һ��Integer����"����"�˼���
		strList.add(5);
		strList.forEach(str -> System.out.println(((String) str).length()));
	}
}