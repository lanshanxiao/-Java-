import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;

public class IteratorEach{
	public static void main(String[] args){
		//创建集合、添加元素的代码与前一个程序相同
		Collection books = new HashSet();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		//获取books集合对应的迭代器
		Iterator it = books.iterator();
		it.forEachRemaining(obj -> System.out.println("迭代集合元素：" + obj));
	}
}