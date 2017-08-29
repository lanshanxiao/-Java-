public class DepositThread extends Thread
{
	// ģ���û��˻�
	private Account account;
	// ��ǰȡǮ�߳���ϣ������Ǯ��
	private double depositAmount;
	public DepositThread(String name , Account account
		, double depositAmount)
	{
		super(name);
		this.account = account;
		this.depositAmount = depositAmount;
	}
	// �ظ�100��ִ�д�����
	public void run()
	{
		for (int i = 0 ; i < 100 ; i++ )
		{
			account.deposit(depositAmount);
		}
	}
}
