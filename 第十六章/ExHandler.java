// �����Լ����쳣������
class MyExHandler implements Thread.UncaughtExceptionHandler
{
	// ʵ��uncaughtException�������÷����������̵߳�δ�����쳣
	public void uncaughtException(Thread t, Throwable e)
	{
		System.out.println(t + " �̳߳������쳣��" + e);
	}
}
public class ExHandler
{
	public static void main(String[] args)
	{
		// �������̵߳��쳣������
		Thread.currentThread().setUncaughtExceptionHandler
			(new MyExHandler());
		int a = 5 / 0;     // ��
		System.out.println("��������������");
	}
}
