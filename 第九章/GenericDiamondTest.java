class MyClass<E>{
	public <T> MyClass(T t){
		System.out.println("t ������ֵΪ��" + t);
	}
}

public class GenericDiamondTest{
	public static void main(String[] args){
		//MyClass�������е�E�β���String����
		//���͹�������������T������Integer����
		MyClass<String> mc1 = new MyClass<>(5);
		//��ʾָ�����͹�������������T�β���Integer����
		MyClass<String> mc2 = new <Integer> MyClass<String>(5);
		//MyClass�������е�E�β���String����
		//����ʾָ�����͹�������������T�β���Integer����
		//��ʱ�Ͳ���ʹ�á����Ρ��﷨����������Ǵ����
		MyClass<String> mc3 = new <Integer> MyClass<>(5);
	}
}