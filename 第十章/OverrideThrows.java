import java.io.FileInputStream;
import java.io.IOException;

public class OverrideThrows{
	public void test() throws IOException{
		FileInputStream fis = new FileInputStream("a.txt");
	}
}
class Sub extends OverrideThrows{
	//���෽�������׳��˱ȸ��෽��������쳣
	//�������淽������
	public void test() throws Exception{ }
}