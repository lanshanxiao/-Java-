import java.io.PushbackInputStream;
import java.io.PushbackReader;
import java.io.FileReader;
import java.io.IOException;

public class PushbackTest
{
	public static void main(String[] args)
	{
		try(
			// ����һ��PushbackReader����ָ���ƻػ������ĳ���Ϊ64
			PushbackReader pr = new PushbackReader(new FileReader(
				"PushbackTest.java") , 64))
		{
			char[] buf = new char[32];
			// ���Ա����ϴζ�ȡ���ַ�������
			String lastContent = "";
			int hasRead = 0;
			// ѭ����ȡ�ļ�����
			while ((hasRead = pr.read(buf)) > 0)
			{
				// ����ȡ������ת�����ַ���
				String content = new String(buf , 0 , hasRead);
				int targetIndex = 0;
				// ���ϴζ�ȡ���ַ����ͱ��ζ�ȡ���ַ���ƴ������
				// �鿴�Ƿ����Ŀ���ַ���, �������Ŀ���ַ���
				if ((targetIndex = (lastContent + content)
					.indexOf("new PushbackReader")) > 0)
				{
					// ���������ݺ��ϴ�����һ���ƻػ�����
					pr.unread((lastContent + content).toCharArray());
					// ���¶���һ������ΪtargetIndex��char����
					if(targetIndex > 32)
					{
						buf = new char[targetIndex];
					}
					// �ٴζ�ȡָ�����ȵ����ݣ�����Ŀ���ַ���֮ǰ�����ݣ�
					pr.read(buf , 0 , targetIndex);
					// ��ӡ��ȡ������
					System.out.print(new String(buf , 0 ,targetIndex));
					System.exit(0);
				}
				else
				{
					// ��ӡ�ϴζ�ȡ������
					System.out.print(lastContent);
					// ������������Ϊ�ϴζ�ȡ������
					lastContent = content;
				}
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}

