import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class ResolveTest
{
	public static void main(String[] args)
	{
		try(
			// ����һ��ObjectOutputStream������
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("transient.txt"));
			// ����һ��ObjectInputStream������
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("transient.txt")))
		{
			oos.writeObject(Orientation.HORIZONTAL);
			Orientation ori = (Orientation)ois.readObject();
			System.out.println(ori == Orientation.HORIZONTAL);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}