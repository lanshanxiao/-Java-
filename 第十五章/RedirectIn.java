import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class RedirectIn
{
	public static void main(String[] args)
	{
		try(
			FileInputStream fis = new FileInputStream("RedirectIn.java"))
		{
			// ����׼�����ض���fis������
			System.setIn(fis);
			// ʹ��System.in����Scanner�������ڻ�ȡ��׼����
			Scanner sc = new Scanner(System.in);
			// ��������һ�н�ֻ�ѻس���Ϊ�ָ���
			sc.useDelimiter("\n");
			// �ж��Ƿ�����һ��������
			while(sc.hasNext())
			{
				// ���������
				System.out.println("��������������ǣ�" + sc.next());
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}

