public enum Gender implements GenderDesc{
	//�˴���ö��ֵ������ö�Ӧ�Ĺ�����������
	MALE("��")
	//�����Ų���ʵ������һ�����岿��
	{
		public void info(){
			System.out.println("���ö��ֵ��������");
		}
	},
	FEMALE("Ů")
	{
		public void info(){
			System.out.println("���ö��ֵ����Ů��");
		}
	};
	//����һ��public���ε�ʵ������
	private final String name;
	//ö����Ĺ�����ֻ��ʹ��private����
	private Gender(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}	
}