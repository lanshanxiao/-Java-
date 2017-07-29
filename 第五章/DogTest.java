class Dog{
	//定义一个jump()方法
	public void jump(){
		System.out.println("正在执行jump方法");
	}
	
	//定义一个run()方法，run()方法需要借助jump()方法
	public void run(){
		//调用自身jump()方法
		jump();
		System.out.println("正在执行run方法");
	}
}

public class DogTest{
	public static void main(String[] args){
		//创建一个Dog对象
		Dog dog = new Dog();
		//调用dog对象的run方法
		dog.run();
	}
}