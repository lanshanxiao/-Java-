import java.util.List;
import java.util.ArrayList;

public class Canvas{
	//ͬʱ�ڻ����ϻ��ƶ����״
	public void drawAll(List<? extends Shape> shapes){
		for(Shape s : shapes){
			s.draw(this);
		}
	}
	
	public void addRectangle(List<? extends Shape> shapes){
		//�����������������
		shapes.add(0, new Rectangle());
	}
	
	public static void main(String[] args){
		//����Ĵ��뽫���������
		//drawAll�������β�������List<Shape>������List<Circle>
		List<Circle> circleList = new ArrayList<>();
		Canvas c = new Canvas();
		//���ܰ�List<Circle>����List<Shape>ʹ��
		c.drawAll(circleList);
	}
}

