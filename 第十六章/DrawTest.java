public class DrawTest
{
	public static void main(String[] args)
	{
		// ����һ���˻�
		Account acct = new Account("1234567" , 0);
		new DrawThread("ȡǮ��" , acct , 800).start();
		new DepositThread("����߼�" , acct , 800).start();
		new DepositThread("�������" , acct , 800).start();
		new DepositThread("����߱�" , acct , 800).start();
	}
}

