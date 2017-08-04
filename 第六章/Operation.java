public enum Operation{
	PLUS{
		public double eval(double x, double y){
			return x + y;
		}
	},//这里有逗号
	
	MINUS{
		public double eval(double x, double y){
			return x - y;
		}
	},//这里有逗号
	
	TIMES{
		public double eval(double x, double y){
			return x * y;
		}
	},//这里有逗号
	
	DIVIDE{
		public double eval(double x, double y){
			return x / y;
		}
	};
	
	//为枚举类定义一个抽象方法
	//这个抽象方法由不同的枚举值提供不同的实现
	public abstract double eval(double x, double y);
	public static void main(String[] args){
		System.out.println(Operation.PLUS.eval(3, 4));
		System.out.println(Operation.MINUS.eval(3, 4));
		System.out.println(Operation.TIMES.eval(3, 4));
		System.out.println(Operation.DIVIDE.eval(3, 4));
	}
}