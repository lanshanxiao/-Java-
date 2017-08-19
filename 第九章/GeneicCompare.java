import java.util.List;
import java.util.ArrayList;

public class GeneicCompare{
	public static void main(String[] args){
		//分别创建List<String>对象和List<Integer>对象
		List<Integer> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		//调用getClass()方法来比较list1和list2的类是否相等
		System.out.println(list1.getClass() == list2.getClass());
	}
}