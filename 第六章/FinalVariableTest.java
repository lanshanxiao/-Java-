public class FinalVariableTest{
	//�����Ա������ָ����ʼֵ���Ϸ�
	final int a = 6;
	//����������ڹ��������ʼ�����з����ʼֵ
	final String str;
	final int c;
	final static double d;
	//��û��ָ����ʼֵ����û���ڳ�ʼ���顢��������ָ����ʼֵ
	//���涨���chʵ�������ǲ��Ϸ���
	final char ch;
	//��ʼ���飬�ɶ�û��ָ����ʼֵ��ʵ������ָ����ʼֵ
	{
		//�ڳ�ʼ������Ϊʵ������ָ����ʼֵ���Ϸ�
		str = "hello";
		//����aʵ������ʱ�Ѿ�ָ����Ĭ��ֵ
		//����Ϊa���¸�ֵ��������渳ֵ���Ƿ�
		a = 9;
	}
	//��̬��ʼ���飬�ɶ�û��ָ����ʼֵ�������ָ����ʼֵ
	static{
		//�ھ�̬��ʼ������Ϊ�����ָ����ʼֵ���Ϸ�
		d = 5.6;
	}
	//�������У��ɶ�û��ָ����ʼֵ����û���ڳ�ʼ������
	//ָ����ʼֵ��ʵ������ָ����ʼֵ
	public FinalVariableTest(){
		//���ڳ�ʼ�������Ѿ���strָ���˳�ʼֵ
		//��ô�ڹ������в��ܶ�final�������¸�ֵ������ĸ�ֵ���Ƿ�
		str = "java";
		c = 5;
	}
	public void changeFinal(){
		//��ͨ��������Ϊfinal���εĳ�Ա������ֵ
		d = 1.2;
		//��������ͨ������Ϊfinal��Ա����ָ����ʼֵ
		ch = 'a';
	}
	public static void main(String[] args){
		FinalVariableTest ft = new FinalVariableTest();
		System.out.println(ft.a);
		System.out.println(ft.c);
		System.out.println(ft.d);
	}
}