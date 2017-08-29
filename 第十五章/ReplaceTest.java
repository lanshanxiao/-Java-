import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class ReplaceTest
{
	public static void main(String[] args)
	{
		try(
			// ����һ��ObjectOutputStream�����
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("replace.txt"));
			// ����һ��ObjectInputStream������
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("replace.txt")))
		{
			Person per = new Person("�����", 500);
			// ϵͳ��per����ת���ֽ����в����
			oos.writeObject(per);
			// �����л���ȡ�õ�����ArrayList
			ArrayList list = (ArrayList)ois.readObject();
			System.out.println(list);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}

