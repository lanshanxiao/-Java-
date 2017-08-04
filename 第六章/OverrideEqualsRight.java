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
	
	//重写equals()方法
	public boolean equals(Object obj){
		//若两个对象为同一个对象
		if(this == obj)
			return true;
		//只有当obj是Person对象
		if(obj != null && obj.getClass() == Person.class){
			Person personObj = (Person) obj;
			//并且当前对象的idStr与obj对象的idStr相等时才可判断两个对象相等
			if(this.getIdStr().equals(personObj.getIdStr()))
				return true;
		}
		return false;
	} 
}

public class OverrideEqualsRight{
	public static void main(String[] args){
		Person p1 = new Person("孙悟空", "1234");
		Person p2 = new Person("孙悟空", "1234");
		Person p3 = new Person("孙悟饭", "4321");
		//p1和自身相比
		System.out.println("p1和p1是否相等？" + p1.equals(p1));
		//p1和p2的idStr相等，所以输出true
		System.out.println("p1和p2是否相等？" + p1.equals(p2));
		//p2和p3的idStr不相等，所以输出false
		System.out.println("p2和p3是否相等？" + p2.equals(p3));
	}
}