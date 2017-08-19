import java.util.HashMap;
import java.util.Iterator;

class A{
	int count;
	public A(int count){
		this.count = count;
	}
	//根据count的值来判断两个对象是否相等
	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}
		if(obj != null && obj.getClass() == A.class){
			A a = (A) obj;
			return this.count == a.count;
		}
		return false;
	}
	
	//根据count来计算hashCode值
	public int hashCode(){
		return this.count;
	}
}

public class HashMapErrorTest{
	public static void main(String[] args){
		HashMap ht = new HashMap();
		//此处A类与前一个程序的A类是同一个类
		ht.put(new A(60000), "疯狂Java讲义");
		ht.put(new A(87563), "轻量级Java EE企业应用实战");
		//获得Hashtable的key Set集合对应的Iterator迭代器
		Iterator it =  ht.keySet().iterator();
		//取出Map中第一个key，并修改它的count值
		A first = (A) it.next();
		first.count = 87563;
		System.out.println(ht);
		//只能修改没有被修改过的key所有对应的key-value对
		ht.remove(new A(87563));
		System.out.println(ht);
		//无法获取剩下的value，下面两行代码都将输出null
		System.out.println(ht.get(new A(87563)));
		System.out.println(ht.get(new A(60000)));
	}
}