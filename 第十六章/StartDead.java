public class StartDead extends Thread{
	private int i;
	//重写run()方法，run()方法的方法体就是线程执行体
	public void run(){
		for( ; i < 100; i++){
			System.out.println(getName() + " " + i);
		}
	}
	
	public static void main(String[] args){
		//创建线程对象
		StartDead sd = new StartDead();
		for(int i = 0; i < 300; i++){
			//调用Thread的currentThread()方法获取当前线程
			System.out.println(Thread.currentThread().getName() + " " + i);
			if( i == 20){
				//启动线程
				sd.start();
				//判断启动后线程的isAlive()值，输出true
				System.out.println(sd.isAlive());
			}
			//当线程处于新建、死亡两种状态时，isAlive()方法返回false
			//当i > 20时，该线程肯定已经启动过了，若sd.isAlive()为假时
			//那么就是死亡状态了
			if(i > 20 && !sd.isAlive()){
				//试图再次启动该线程
				sd.start();
			}
		}
	}
}