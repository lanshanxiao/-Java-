class Base{
	public Base(){
		test();
	}
	
	public void test(){
		System.out.println("����������д�ķ���");
	}
}

public class Sub extends Base{
	private String name;
	public void test(){
		System.out.println("������д����ķ�������name�ַ������ȣ�" + name.length());
	}
	
	public static void main(String[] args){
		//����Ĵ����������ָ���쳣
		Sub s = new Sub();
	}
}