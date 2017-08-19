import java.util.EnumSet;
import java.util.Collection;
import java.util.HashSet;

enum Season{
	SPRING, SUMMER, FALL, WINTER
}

public class EnumSetTest2{
	public static void main(String[] args){
		Collection c = new HashSet();
		c.clear();
		c.add(Season.FALL);
		c.add(Season.SPRING);
		//复制Collection集合中的所有元素来创建EnumSet集合
		EnumSet enumSet = EnumSet.copyOf(c);
		System.out.println(enumSet);
		c.add("疯狂Java讲义");
		c.add("轻量级Java EE企业应用实战");
		//下面代码异常，因为c集合中元素不是全部都为枚举值
		enumSet = EnumSet.copyOf(c);
	}
}