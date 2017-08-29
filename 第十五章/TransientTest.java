import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class TransientTest
{
	public static void main(String[] args)
	{
		try(
			// ����һ��ObjectOutputStream�����
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("transient.txt"));
			// ����һ��ObjectInputStream������
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("transient.txt")))
		{
			Person per = new Person("�����", 500);
			// ϵͳ��per����ת���ֽ����в����
			oos.writeObject(per);
			Person p = (Person)ois.readObject();
			System.out.println(p.getAge());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
