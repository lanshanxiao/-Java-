public class Teacher implements java.io.Serializable
{
	private String name;
	private Person student;
	public Teacher(String name , Person student)
	{
		this.name = name;
		this.student = student;
	}
	// �˴�ʡ����name��student��setter��getter����

	// name��setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	// student��setter��getter����
	public void setStudent(Person student)
	{
		this.student = student;
	}
	public Person getStudent()
	{
		return this.student;
	}
}