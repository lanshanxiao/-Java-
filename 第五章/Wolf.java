class Creature{
	public Creature(){
		System.out.println("Creature无参数的构造器");
	}
}

class Animal extends Creature{
	public Animal(String name){
		System.out.println("Animal 带一个参数的构造器，该动物的name为：" + name);
	}
	
	public Animal(String name, int age){
		//使用this调用同一个重载的构造器
		this(name);
		System.out.println("Animal 带两个参数的构造器，该动物的age为：" + age);
	}
}

public class Wolf extends Animal{
	public Wolf(){
		//显示调用父类有两个参数的构造器
		super("灰太狼", 3);
		System.out.println("Wolf 无参数的构造器");
	}
	
	public static void main(String[] args){
		new Wolf();
	}
}