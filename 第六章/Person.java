//����һ���ɱ��࣬��ΪPerson���е�name���õĶ����ǿ��Ը��ĵ�
class Name{
	private String firstName;
	private String lastName;
	public Name(){}
	public Name(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
}

public class Person{
	private final Name name;
	public Person(Name name){
		//����nameʵ������Ϊ��ʱ������Name���󣬸ö����firstName��lastName
		//�봫���name������firstName��lastname��ͬ
		this.name = new Name(name.getFirstName(), name.getLastName());
	}
	public Name getName(){
		//����һ���������󣬸ö����firstName��lastName
		//��ö������name��firstName��lastName��ͬ
		return new Name(name.getFirstName(), name.getLastName());
	}
	public static void main(String[] args){
		Name n = new Name("���", "��");
		Person p = new Person(n);
		//Person�����name��firstNameֵΪ����ա�
		System.out.println(p.getName().getFirstName());
		//�ı�Person�����name��firstNameֵ
		n.setFirstName("�˽�");
		//Person�����name��firstNameֵ����Ϊ���˽䡱
		System.out.println(p.getName().getFirstName());
	}
}