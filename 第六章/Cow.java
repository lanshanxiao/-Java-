public class Cow{
	private double weight;
	//�ⲿ����������صĹ�����
	public Cow(){}
	public Cow(double weight){
		this.weight = weight;
	}
	
	//����һ���Ǿ�̬�ڲ���
	private class CowLeg{
		//�Ǿ�̬�ڲ��������ʵ������
		private double length;
		private String color;
		//�Ǿ�̬�ڲ�����������صĹ�����
		public CowLeg(){}
		public CowLeg(double length, String color){
			this.length = length;
			this.color = color;
		}
		
		//�Ǿ�̬�ڲ����ʵ������
		public void info(){
			System.out.println("��ǰţ����ɫ�ǣ�" + color + "���ߣ�" + length);
			//ֱ�ӷ����ⲿ���private���εĳ�Ա����
			System.out.println("��ţ��������ţ�У�" + weight);
		}
	}
	
	public void test(){
		CowLeg cl = new CowLeg(1.12, "�ڰ���ͬ");
		cl.info();
	}
	
	public static void main(String[] args){
		Cow cow = new Cow(378.9);
		cow.test();
	}
}