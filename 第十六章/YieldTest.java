public class YieldTest extends Thread{
	public YieldTest(String name){
		super(name);
	}
	//����run()������Ϊ�߳�ִ����
	public void run(){
		for(int i = 0; i < 50; i++){
			System.out.println(getName() + " " + i);
			//��i����20ʱ��ʹ��yield()�����õ�ǰ�����ò�
			if(i == 20){
				Thread.yield();
			}
		}
	}
	
	public static void main(String[] args){
		//�������������߳�
		YieldTest yt1 = new YieldTest("�߼�");
		//��yt1�߳����ó�������ȼ�
		yt1.setPriority(Thread.MAX_PRIORITY);
		yt1.start();
		YieldTest yt2 = new YieldTest("�ͼ�");
		//��yt2�߳����ó���ͼ����ȼ�
		yt2.setPriority(Thread.MIN_PRIORITY);
		yt2.start();
	}
}