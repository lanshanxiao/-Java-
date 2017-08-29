import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RedirectOut
{
	public static void main(String[] args)
	{
		try(
			// һ���Դ���PrintStream�����
			PrintStream ps = new PrintStream(new FileOutputStream("out.txt")))
		{
			// ����׼����ض���ps�����
			System.setOut(ps);
			// ���׼������һ���ַ���
			System.out.println("��ͨ�ַ���");
			// ���׼������һ������
			System.out.println(new RedirectOut());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}

