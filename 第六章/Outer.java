public class Outer{
	private int outProp = 9;
	class Inner{
		private int inProp = 5;
		public void accessOuterProp(){
			//�Ǿ�̬�ڲ������ֱ�ӷ����ⲿ���private��Ա����
			System.out.println("�ⲿ���outPropֵ��" + outProp);
		}
	}
	
	public void accessInnerProp(){
		//�ⲿ�಻��ֱ�ӷ��ʷǾ�̬�ڲ����ʵ������
		//���������ֱ༭����
		//System.out.println("�ڲ����inPropֵ��" + inProp);
		//�������ڲ����ʵ��������������ʾ�����ڲ������
		System.out.println("�ڲ����inPropֵ��" + new Inner().inProp);
	}
	
	public static void main(String[] args){
		//ִ��������룬֮�������ⲿ����󣬻�δ�����ڲ������
		Outer out = new Outer();
		out.accessInnerProp();
	}
}