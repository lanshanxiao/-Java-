import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Stream;

public class CollectionStream{
	public static void main(String[] args){
		//创建books集合、为books集合添加元素的代码
		Collection books = new HashSet();
		books.add(new String("轻量级Java EE企业应用实战"));
		books.add(new String("疯狂Java讲义"));
		books.add(new String("疯狂IOS讲义"));
		books.add(new String("疯狂Ajax讲义"));
		books.add(new String("疯狂Android讲义"));
		//统计书名中包含“疯狂”子串的图书数量
		System.out.println(books.stream().filter(ele -> ((String) ele).contains("疯狂")).count());
		//统计书名中包含“Java”子串的图书数量
		System.out.println(books.stream().filter(ele -> ((String) ele).contains("Java")).count());
		//统计书名长度大于10的图书数量
		System.out.println(books.stream().filter(ele -> ((String) ele).length() > 10).count());
		//先调用Collection对象的stream()方法将集合转换为Stream
		//再调用Stream的mapToInt()方法获取原有的Stream对应的IntStream
		books.stream().mapToInt(ele -> ((String) ele).length()).forEach(System.out::println);//输出8 11 16 7 8
	}
}