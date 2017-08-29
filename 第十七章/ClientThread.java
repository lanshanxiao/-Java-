import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientThread implements Runnable
{
	// ���̸߳������Socket
	private Socket s;
	// ���߳��������Socket����Ӧ��������
	BufferedReader br = null;
	public ClientThread(Socket s)
		throws IOException
	{
		this.s = s;
		br = new BufferedReader(
			new InputStreamReader(s.getInputStream()));
	}
	public void run()
	{
		try
		{
			String content = null;
			// ���϶�ȡSocket�������е����ݣ�������Щ���ݴ�ӡ���
			while ((content = br.readLine()) != null)
			{
				System.out.println(content);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
