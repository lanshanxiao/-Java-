public class StaticAccessNonStatic{
	public void info(){
		System.out.println("简单的info方法");
	}
	
	public static void main(String[] args){
		//创建一个对象作为调用者来调用info()方法
		new StaticAccessNonStatic().info();
	}
}