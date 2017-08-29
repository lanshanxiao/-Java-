import java.util.concurrent.*;

class Producer extends Thread
{
	private BlockingQueue<String> bq;
	public Producer(BlockingQueue<String> bq)
	{
		this.bq = bq;
	}
	public void run()
	{
		String[] strArr = new String[]
		{
			"Java",
			"Struts",
			"Spring"
		};
		for (int i = 0 ; i < 99 ; i++ )
		{
			System.out.println(getName() + "������׼����������Ԫ�أ�");
			try
			{
				Thread.sleep(200);
				// ���Է���Ԫ�أ���������������̱߳�����
				bq.put(strArr[i % 3]);
			}
			catch (Exception ex){ex.printStackTrace();}
			System.out.println(getName() + "������ɣ�" + bq);
		}
	}
}
class Consumer extends Thread
{
	private BlockingQueue<String> bq;
	public Consumer(BlockingQueue<String> bq)
	{
		this.bq = bq;
	}
	public void run()
	{
		while(true)
		{
			System.out.println(getName() + "������׼�����Ѽ���Ԫ�أ�");
			try
			{
				Thread.sleep(200);
				// ����ȡ��Ԫ�أ���������ѿգ��̱߳�����
				bq.take();
			}
			catch (Exception ex){ex.printStackTrace();}
			System.out.println(getName() + "������ɣ�" + bq);
		}
	}
}
public class BlockingQueueTest2
{
	public static void main(String[] args)
	{
		// ����һ������Ϊ1��BlockingQueue
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
		// ����3���������߳�
		new Producer(bq).start();
		new Producer(bq).start();
		new Producer(bq).start();
		// ����һ���������߳�
		new Consumer(bq).start();
	}
}