import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;

public class ForeachTest{
	public static void main(String[] args){
		//创建集合、添加元素的代码与前一个程序相同
		Collection books = new HashSet();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		for(Object obj : books){
			//此处的book变量也不是集合元素本身
			String book = (String) obj;
			System.out.println(book);
			if(book.equals("疯狂Java讲义")){
				//下面代码引发异常
				books.remove(book);
			}
		}
		System.out.println(books);
	}
}