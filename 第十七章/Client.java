import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Client
{
	public static void main(String[] args)
		throws IOException
	{
		Socket socket = new Socket("127.0.0.1" , 30000);   // ��
		// ��Socket��Ӧ����������װ��BufferedReader
		BufferedReader br = new BufferedReader(
		new InputStreamReader(socket.getInputStream()));
		// ������ͨIO����
		String line = br.readLine();
		System.out.println("���Է����������ݣ�" + line);
		// �ر���������socket
		br.close();
		socket.close();
	}
}
