public class GenderTest{
	public static void main(String[] args){
		//ͨ��Enum��valueOf()��������ȡָ��ö�����ö��ֵ
		Gender nv = Gender.valueOf("FEMALE");
		System.out.println(nv + "����" + nv.getName());
		nv.info();
		
		Gender nan = Gender.valueOf("MALE");
		System.out.println(nan + "����" + nan.getName());
		nan.info();
	}
}