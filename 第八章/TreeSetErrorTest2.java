import java.util.TreeSet;
import java.util.Date;

public class TreeSetErrorTest2{
	public static void main(String[] args){
		TreeSet ts = new TreeSet();
		//向TreeSet集合中添加两个对象
		ts.add(new String("疯狂Java讲义"));
		ts.add(new Date());
	}
}