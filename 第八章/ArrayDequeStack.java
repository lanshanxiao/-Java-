import java.util.ArrayDeque;

public class ArrayDequeStack{
	public static void main(String[] args){
		ArrayDeque stack = new ArrayDeque();
		//���ν�����Ԫ��push��ջ
		stack.push("���Java����");
		stack.push("������Java EE��ҵӦ��ʵս");
		stack.push("���Android����");
		System.out.println(stack);
		//���ʵ�һ��Ԫ�أ������������ջ
		System.out.println(stack.peek());
		System.out.println(stack);
		//pop����һ��Ԫ��
		System.out.println(stack.pop());
		System.out.println(stack);
	}
}