public class Varargs{
	//定义了一个参数个数可变的方法
	//和public static void test(int a, String[] books)等价
	public static void test(int a, String ... books){
		//books被当成数组处理
		for(String tmp : books){
			System.out.println(tmp);
		}
		//输出整数变量a的值
		System.out.println(a);
	}
	
	public static void main(String[] args){
		//调用test方法
		test(5, "疯狂Java讲义", "轻量级Java EE企业应用实战");
		test(5, new String[] {"疯狂Android讲义", "经典Java EE企业应用实战"});
	}
}