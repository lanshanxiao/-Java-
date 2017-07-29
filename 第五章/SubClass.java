class BaseClass{
	public int book = 5;
	public void test(){
		System.out.println("父类被覆盖的方法");
	}
}

class SubClass extends BaseClass{
	public String book = "疯狂Java讲义";
	
	public void test(){
		System.out.println("子类覆盖父类方法");
	}
	
	public void sub(){
		System.out.println("子类普通方法");
	}
	public static void main(String[] args){
		BaseClass bc = new SubClass();
		System.out.println(bc.book);
		bc.test();
		
		//因为bc编译时的类型是BaseClass
		//BaseClass类中没有提供sub()方法，所以下面代码编译时会出错
		//bc.sub();
	}
}