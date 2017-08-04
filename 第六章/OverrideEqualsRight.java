class Person{
	private String name;
	private String idStr;
	public Person(){}
	public Person(String name, String idStr){
		this.name = name;
		this.idStr = idStr;
	}
	
	public String getIdStr(){
		return idStr;
	}
	
	//��дequals()����
	public boolean equals(Object obj){
		//����������Ϊͬһ������
		if(this == obj)
			return true;
		//ֻ�е�obj��Person����
		if(obj != null && obj.getClass() == Person.class){
			Person personObj = (Person) obj;
			//���ҵ�ǰ�����idStr��obj�����idStr���ʱ�ſ��ж������������
			if(this.getIdStr().equals(personObj.getIdStr()))
				return true;
		}
		return false;
	} 
}

public class OverrideEqualsRight{
	public static void main(String[] args){
		Person p1 = new Person("�����", "1234");
		Person p2 = new Person("�����", "1234");
		Person p3 = new Person("����", "4321");
		//p1���������
		System.out.println("p1��p1�Ƿ���ȣ�" + p1.equals(p1));
		//p1��p2��idStr��ȣ��������true
		System.out.println("p1��p2�Ƿ���ȣ�" + p1.equals(p2));
		//p2��p3��idStr����ȣ��������false
		System.out.println("p2��p3�Ƿ���ȣ�" + p2.equals(p3));
	}
}