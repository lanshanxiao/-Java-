import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintStream;
import java.io.IOException;

public class Server
{
	public static void main(String[] args)
		throws IOException
	{
		// ����һ��ServerSocket�����ڼ����ͻ���Socket����������
		ServerSocket ss = new ServerSocket(30000);
		// ����ѭ�����Ͻ������Կͻ��˵�����
		while (true)
		{
			// ÿ�����ܵ��ͻ���Socket�����󣬷�������Ҳ��Ӧ����һ��Socket
			Socket s = ss.accept();
			// ��Socket��Ӧ���������װ��PrintStream
			PrintStream ps = new PrintStream(s.getOutputStream());
			// ������ͨIO����
			ps.println("���ã����յ��˷�����������ף����");
			// �ر���������ر�Socket
			ps.close();
			s.close();
		}
	}
}