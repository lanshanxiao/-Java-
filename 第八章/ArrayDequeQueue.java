import java.util.ArrayDeque;

public class ArrayDequeQueue{
	public static void main(String[] args){
		ArrayDeque queue = new ArrayDeque();
		//���ν�����Ԫ�ؼ������
		queue.offer("���Java����");
		queue.offer("������Java EE��ҵӦ��ʵս");
		queue.offer("���Android����");
		System.out.println(queue);
		//���ʵ�һ��Ԫ�أ������������ջ
		System.out.println(queue.peek());
		System.out.println(queue);
		//poll����һ��Ԫ��
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}