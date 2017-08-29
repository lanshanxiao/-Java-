import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class PrintStreamTest{
	public static void main(String[] args){
		try(
			FileOutputStream fos = new FileOutputStream("test.txt");
			PrintStream ps = new PrintStream(fos)
		){
			//使用PrintStream执行输出
			ps.println("普通字符串");
			//直接使用PrintStreamTest输出对象
			ps.println(new PrintStreamTest());
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}