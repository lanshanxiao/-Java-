import java.util.List;
import java.util.ArrayList;

public class GeneicCompare{
	public static void main(String[] args){
		//�ֱ𴴽�List<String>�����List<Integer>����
		List<Integer> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		//����getClass()�������Ƚ�list1��list2�����Ƿ����
		System.out.println(list1.getClass() == list2.getClass());
	}
}