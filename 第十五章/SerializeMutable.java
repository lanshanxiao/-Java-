import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class SerializeMutable
{
	public static void main(String[] args)
	{

		try(
			// ����һ��ObjectOutputStream������
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("mutable.txt"));
			// ����һ��ObjectInputStream������
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("mutable.txt")))
		{
			Person per = new Person("�����", 500);
			// ϵͳ��per����ת���ֽ����в����
			oos.writeObject(per);
			// �ı�per�����nameʵ������
			per.setName("��˽�");
			// ϵͳֻ��������л���ţ����Ըı���name���ᱻ���л�
			oos.writeObject(per);
			Person p1 = (Person)ois.readObject();    //��
			Person p2 = (Person)ois.readObject();    //��
			// �������true���������л���p1����p2
			System.out.println(p1 == p2);
			// ������Ȼ�������"�����"�����ı���ʵ������û�б����л�
			System.out.println(p2.getName());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}