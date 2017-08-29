import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTeacher
{
	public static void main(String[] args)
	{
		try(
			// ����һ��ObjectOutputStream�����
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("teacher.txt")))
		{
			Person per = new Person("�����", 500);
			Teacher t1 = new Teacher("��ɮ" , per);
			Teacher t2 = new Teacher("������ʦ" , per);
			// ���ν��ĸ�����д�������
			oos.writeObject(t1);
			oos.writeObject(t2);
			oos.writeObject(per);
			oos.writeObject(t2);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}

