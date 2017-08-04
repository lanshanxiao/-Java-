public enum Operation{
	PLUS{
		public double eval(double x, double y){
			return x + y;
		}
	},//�����ж���
	
	MINUS{
		public double eval(double x, double y){
			return x - y;
		}
	},//�����ж���
	
	TIMES{
		public double eval(double x, double y){
			return x * y;
		}
	},//�����ж���
	
	DIVIDE{
		public double eval(double x, double y){
			return x / y;
		}
	};
	
	//Ϊö���ඨ��һ�����󷽷�
	//������󷽷��ɲ�ͬ��ö��ֵ�ṩ��ͬ��ʵ��
	public abstract double eval(double x, double y);
	public static void main(String[] args){
		System.out.println(Operation.PLUS.eval(3, 4));
		System.out.println(Operation.MINUS.eval(3, 4));
		System.out.println(Operation.TIMES.eval(3, 4));
		System.out.println(Operation.DIVIDE.eval(3, 4));
	}
}