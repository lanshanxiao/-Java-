//错误的方法覆盖
class BaseClass{
	//test()方法是private，子类不能继承
	private void test(){}
}

class SubClass{
	//不是方法重写，所以可以增加static关键字
	public static void test(){}
}