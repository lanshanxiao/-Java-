public class Apple{
	public String name;
	public String color;
	public double weight;
	
	public Apple(){}
	//���������Ĺ�����
	public Apple(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	//���������Ĺ�����
	public Apple(String name, String color, double weight){
		//ͨ��this������һ�����صĹ������ĳ�ʼ������
		this(name, color);
		//����this���øù��������ڳ�ʼ����Apple����
		this.weight = weight;
	}
}

//������this(name, color);�����ֻ���ڹ�������ʹ�ã����ұ�����Ϊ������ִ����ĵ�һ����䡣