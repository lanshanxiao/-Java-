public class JoinThread extends Thread{
	//�ṩһ���в����Ĺ��������������ø��̵߳�����
	public JoinThread(String name){
		super(name);
	}
	//��дrun()�����������߳�ִ����
	public void run(){
		for(int i = 0; i < 100; i++){
			System.out.println(getName() + " " + i);
		}
	}
	
	public static void main(String[] args) throws Exception{
		//�������߳�
		new JoinThread("���߳�").start();
		for(int i = 0; i < 100; i++){
			
			if(i == 20){
				JoinThread jt = new JoinThread("��Join���߳�");
				jt.start();
				//main�̵߳�����jt�̵߳�join()������main�̱߳����jtִ�н����Ż�����ִ��
				jt.join();
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}