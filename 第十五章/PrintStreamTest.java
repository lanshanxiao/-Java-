import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class PrintStreamTest{
	public static void main(String[] args){
		try(
			FileOutputStream fos = new FileOutputStream("test.txt");
			PrintStream ps = new PrintStream(fos)
		){
			//ʹ��PrintStreamִ�����
			ps.println("��ͨ�ַ���");
			//ֱ��ʹ��PrintStreamTest�������
			ps.println(new PrintStreamTest());
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}