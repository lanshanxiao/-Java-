import java.util.PriorityQueue;

public class PriorityQueueTest{
	public static void main(String[] args){
		PriorityQueue pq = new PriorityQueue();
		//�������������pq�м����ĸ�Ԫ��
		pq.offer(6);
		pq.offer(-3);
		pq.offer(20);
		pq.offer(18);
		//������У������ǰ�����˳������
		System.out.println(pq);
		//���ʶ��еĵ�һ��Ԫ�أ���ʵ���Ƕ�������С��Ԫ��
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}