public class StartDead extends Thread{
	private int i;
	//��дrun()������run()�����ķ���������߳�ִ����
	public void run(){
		for( ; i < 100; i++){
			System.out.println(getName() + " " + i);
		}
	}
	
	public static void main(String[] args){
		//�����̶߳���
		StartDead sd = new StartDead();
		for(int i = 0; i < 300; i++){
			//����Thread��currentThread()������ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName() + " " + i);
			if( i == 20){
				//�����߳�
				sd.start();
				//�ж��������̵߳�isAlive()ֵ�����true
				System.out.println(sd.isAlive());
			}
			//���̴߳����½�����������״̬ʱ��isAlive()��������false
			//��i > 20ʱ�����߳̿϶��Ѿ��������ˣ���sd.isAlive()Ϊ��ʱ
			//��ô��������״̬��
			if(i > 20 && !sd.isAlive()){
				//��ͼ�ٴ��������߳�
				sd.start();
			}
		}
	}
}