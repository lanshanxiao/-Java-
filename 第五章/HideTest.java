class Parent {
	public String tag = "���Java����";
}

class Derived extends Parent{
	//����һ��˽�е�tagʵ�����������ظ��׵�tagʵ������
	private String tag = "������Java EE��ҵӦ��ʵս";
}

public class HideTest{
	public static void main(String[] args){
		Derived d = new Derived();
		//���򲻿ɷ���d��˽�б���tag������������佫����������
		//System.out.println(d.tag);
		//��d������ʽ������ת��ΪParent�󣬼��ɷ���tagʵ������
		System.out.println(((Parent) d).tag);
	}
}