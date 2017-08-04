//这是一个可变类，因为Person类中的name引用的对象是可以更改的
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
		//设置name实例变量为临时创建的Name对象，该对象的firstName和lastName
		//与传入的name参数的firstName和lastname相同
		this.name = new Name(name.getFirstName(), name.getLastName());
	}
	public Name getName(){
		//返回一个匿名对象，该对象的firstName和lastName
		//与该对象里的name的firstName和lastName相同
		return new Name(name.getFirstName(), name.getLastName());
	}
	public static void main(String[] args){
		Name n = new Name("悟空", "孙");
		Person p = new Person(n);
		//Person对象的name得firstName值为“悟空”
		System.out.println(p.getName().getFirstName());
		//改变Person对象的name的firstName值
		n.setFirstName("八戒");
		//Person对象的name的firstName值被改为“八戒”
		System.out.println(p.getName().getFirstName());
	}
}