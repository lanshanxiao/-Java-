public class Apple{
	public String name;
	public String color;
	public double weight;
	
	public Apple(){}
	//两个参数的构造器
	public Apple(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	//三个参数的构造器
	public Apple(String name, String color, double weight){
		//通过this调用另一个重载的构造器的初始化代码
		this(name, color);
		//下面this引用该构造器正在初始化的Apple对象
		this.weight = weight;
	}
}

//程序中this(name, color);该语句只能在构造其中使用，而且必须作为构造器执行体的第一条语句。