//定义Shape的子类Rectangle
public class Rectangle extends Shape{
	public void draw(Canvas c){
		//实现画图方法，以打印字符串来模拟画图方法实现
		System.out.println("把一个矩形画在画布" + c + "上");
	}
}
