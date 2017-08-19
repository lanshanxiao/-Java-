import java.util.List;
import java.util.ArrayList;

public class Canvas{
	//同时在画布上绘制多个形状
	public void drawAll(List<? extends Shape> shapes){
		for(Shape s : shapes){
			s.draw(this);
		}
	}
	
	public void addRectangle(List<? extends Shape> shapes){
		//下面代码引起编译错误
		shapes.add(0, new Rectangle());
	}
	
	public static void main(String[] args){
		//下面的代码将会引起错误
		//drawAll方法的形参类型是List<Shape>而不是List<Circle>
		List<Circle> circleList = new ArrayList<>();
		Canvas c = new Canvas();
		//不能把List<Circle>当成List<Shape>使用
		c.drawAll(circleList);
	}
}

