class Dog{
	//����һ��jump()����
	public void jump(){
		System.out.println("����ִ��jump����");
	}
	
	//����һ��run()������run()������Ҫ����jump()����
	public void run(){
		//��������jump()����
		jump();
		System.out.println("����ִ��run����");
	}
}

public class DogTest{
	public static void main(String[] args){
		//����һ��Dog����
		Dog dog = new Dog();
		//����dog�����run����
		dog.run();
	}
}