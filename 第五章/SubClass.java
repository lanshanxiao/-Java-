class BaseClass{
	public int book = 5;
	public void test(){
		System.out.println("���౻���ǵķ���");
	}
}

class SubClass extends BaseClass{
	public String book = "���Java����";
	
	public void test(){
		System.out.println("���า�Ǹ��෽��");
	}
	
	public void sub(){
		System.out.println("������ͨ����");
	}
	public static void main(String[] args){
		BaseClass bc = new SubClass();
		System.out.println(bc.book);
		bc.test();
		
		//��Ϊbc����ʱ��������BaseClass
		//BaseClass����û���ṩsub()��������������������ʱ�����
		//bc.sub();
	}
}