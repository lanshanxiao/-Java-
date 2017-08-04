public class GenderTest{
	public static void main(String[] args){
		//通过Enum的valueOf()方法来获取指定枚举类的枚举值
		Gender nv = Gender.valueOf("FEMALE");
		System.out.println(nv + "代表：" + nv.getName());
		nv.info();
		
		Gender nan = Gender.valueOf("MALE");
		System.out.println(nan + "代表：" + nan.getName());
		nan.info();
	}
}